package org.coursera.ExperienciaAcesso.outro;

import org.coursera.ExperienciaAcesso.pacote.Referencia;

//modificadores que podem ser acessados na própria classe
public class Outra {
	
	public void testeAcesso() {
		Referencia r = new Referencia();
//		r.modificadorDefault = 0;
		r.modificadorPublico = 0;
//		r.modificadorProtegido = 0;
//		r.modificadorPrivado = 0;
	}

}
