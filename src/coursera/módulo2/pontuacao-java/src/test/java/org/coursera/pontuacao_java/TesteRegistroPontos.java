package org.coursera.pontuacao_java;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TesteRegistroPontos {

	@Test
	void pontosCriarTopico() {
		Usuario usuario = new Usuario();
		usuario.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 5);

	}
	@Test
	void pontosCriarTopicoVIP() {
		Usuario usuario = new Usuario();
		usuario.nome = "Guerra";
		usuario.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 25);
		
	}
	@Test
	void pontosCriarTopicoBonusDoDio() {
		Usuario usuario = new Usuario();
		usuario.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 15);
		
	}
	@Test
	void pontosCriarTopicoVIPBonusDoDio() {
		Usuario usuario = new Usuario();
		usuario.nome = "Guerra";
		usuario.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 50);
		
	}


}
