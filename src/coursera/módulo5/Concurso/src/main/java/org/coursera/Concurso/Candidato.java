package org.coursera.Concurso;

public class Candidato implements Comparable<Candidato> {

	private int nota;
	private boolean deficiente;
	private int idade;

	// Construtor para criar objetos
	public Candidato(int nota, boolean deficiente, int idade) {
		super();
		this.nota = nota;
		this.deficiente = deficiente;
		this.idade = idade;
	}

	public int getNota() {
		return nota;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public int compareTo(Candidato outro) {
//		Verificar se a nota é igual
		if (nota == outro.getNota()) {
			if (deficiente == outro.isDeficiente()) {
				return idade - outro.getIdade();
			} else {
				if (deficiente) {
					return 1;
				} else {
					return -1;
				}
			}
		} else {
			return nota - outro.getNota();
		}

	}

	// Método para imprimir o objeto
	@Override
	public String toString() {
		return nota + ";" + deficiente + ";" + idade;
	}

}
