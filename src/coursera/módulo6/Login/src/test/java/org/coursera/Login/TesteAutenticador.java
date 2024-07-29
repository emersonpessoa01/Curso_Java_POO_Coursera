package org.coursera.Login;

import static org.junit.Assert.*;
import org.junit.Test;

public class TesteAutenticador { // A classe de teste deve ser pública

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("guerra", "senhadoguerra");
		assertEquals("guerra", u.getLogin());
	}

	public void loginFalha() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("guerra", "senhaerradadoguerra");
	}

	@Test
	public void informacaoDoErro() {
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("guerra", "senhaerradadoguerra");
			fail("LoginException esperada"); // Adiciona uma mensagem para indicar a falha
		} catch (LoginException e) {
			assertNotEquals("guerra", e.getLogin());
		}
	}

}
