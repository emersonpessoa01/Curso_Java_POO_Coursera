package org.coursera.ExperienciaAcesso.pacote;

public class OutraMesmoPacote {
//	modificadores que consegue acessar de uma classe no mesmo pacote
	public void testeAcesso() {
		Referencia r = new Referencia();
		r.modificadorDefault = 0;
		r.modificadorPublico = 0;
		r.modificadorProtegido = 0;
//		r.modificadorPrivado = 0;
	}

}
