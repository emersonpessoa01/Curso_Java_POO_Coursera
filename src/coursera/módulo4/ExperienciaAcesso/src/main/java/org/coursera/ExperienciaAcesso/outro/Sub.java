package org.coursera.ExperienciaAcesso.outro;

import org.coursera.ExperienciaAcesso.pacote.Referencia;

//modificadores que consegue acessar de uma subclasse em outro pacote
public class Sub extends Referencia {
	public void testeAcesso() {
		Referencia r = new Referencia();
//		modificadorDefault = 0;
		modificadorPublico = 0;
		modificadorProtegido = 0;
//		modificadorPrivado = 0;
	}

}
