package org.coursera.Carros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteCarroMult {
	CarroDeCorrida c;

	@Before
	public void inicializaCarro() {
		c = new CarroMult("teste", 1.5, 100);
	}

	@Test
	public void testCarroParado() {
		inicializaCarro();
		assertEquals(0, c.getVelocidade());
	}

	@Test
	public void testAcelerarUmaVez() {
		inicializaCarro();
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	@Test
	public void testAcelerarDuasVezes() {
		inicializaCarro();
		c.acelerar();
		c.acelerar();
		assertEquals(15, c.getVelocidade());
	}

	public void testFrearAteZero() {
		inicializaCarro();
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}

	public void testFrear() {
		inicializaCarro();
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}

	public void testAcelerarAteVelocidadeMaxima() {
		for (int i = 0; i < 14; i++) {
			c.acelerar();
			assertEquals(100, c.getVelocidade());
		}

	}

}
