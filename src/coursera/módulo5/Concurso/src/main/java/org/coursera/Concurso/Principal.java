package org.coursera.Concurso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Candidato> lista = new ArrayList<>();
		Candidato candidato1 = new Candidato(80, true, 30);
		Candidato candidato2 = new Candidato(80, true, 25);
		Candidato candidato3 = new Candidato(80, true, 28);
		Candidato candidato4 = new Candidato(90, true, 20);
		lista.add(candidato1);
		lista.add(candidato2);
		lista.add(candidato3);
		lista.add(candidato4);

		Collections.sort(lista);

		// Para chamar o método toString
		for (Candidato candidato : lista) {
			System.out.println(candidato);
		}

	}

}
