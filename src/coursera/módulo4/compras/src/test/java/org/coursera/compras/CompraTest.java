package org.coursera.compras;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CompraTest {

	@Test
	public void testCompra() {
		Compra compra = new Compra(100.0);
		assertEquals(100.0, compra.total(), 0.01);
	}

	@Test
	public void testCompraParceladaUmaParcela() {
		CompraParcelada compraParcelada = new CompraParcelada(100.0, 1, 2.0);
		assertEquals(102.0, compraParcelada.total(), 0.01);
	}

	@Test
	public void testCompraParceladaDuasParcelas() {
		CompraParcelada compraParcelada = new CompraParcelada(100.0, 2, 2.0);
		assertEquals(104.04, compraParcelada.total(), 0.01);
	}

	@Test
	public void testCompraParceladaCincoParcelas() {
		CompraParcelada compraParcelada = new CompraParcelada(100.0, 5, 2.0);
		assertEquals(110.41, compraParcelada.total(), 0.01);
	}

	@Test
	public void testCompraParceladaDezParcelas() {
		CompraParcelada compraParcelada = new CompraParcelada(100.0, 10, 2.0);
		assertEquals(121.90, compraParcelada.total(), 0.01);
	}
}
