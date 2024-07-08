import static org.junit.jupiter.api.Assertions.*;

import org.coursera.Banco.ContaCorrente;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaCorrente {
	ContaCorrente cc;
	@Before
	public void inicializaConta(){
		cc = new ContaCorrente();
		cc.depositar(200);
	}

	@Test
	public void deposito() {
//		ContaCorrente cc = new ContaCorrente();
//		cc.depositar(200);
		inicializaConta();
		assertEquals(cc.saldo,200);
	}
	@Test
	public void saque() {
//		ContaCorrente cc = new ContaCorrente();
//		cc.depositar(200);
		inicializaConta();
		int valorSacado = cc.sacar(50);
		assertEquals(cc.saldo,150);
		assertEquals(valorSacado,50);
	}
	@Test
	public void saqueMaiorQueSaldo() {
//		ContaCorrente cc = new ContaCorrente();
//		cc.depositar(200);
		inicializaConta();
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo,200);
		assertEquals(valorSacado,0);
	}

}
