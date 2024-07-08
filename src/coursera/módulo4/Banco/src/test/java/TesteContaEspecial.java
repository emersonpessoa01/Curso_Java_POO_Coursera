import static org.junit.jupiter.api.Assertions.*;

import org.coursera.Banco.ContaEspecial;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaEspecial extends TesteContaCorrente {


	@Before
	public void inicializaConta(){
		cc = new ContaEspecial(100);
		cc.depositar(200);
	}
	@Test
	public void saqueMaiorQueSaldo() {
		inicializaConta();
		int valorSacado = cc.sacar(350);
		assertEquals(cc.saldo,200);
		assertEquals(valorSacado,0);
	}
	@Test
	public void saqueMaiorQueSaldoDentroDoLimite() {
		inicializaConta();
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo,-50);
		assertEquals(valorSacado,250);
	}

}
