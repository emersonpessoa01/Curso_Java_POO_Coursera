package org.coursera.escola;

public class Aluno {
	int bim1;
	int bim2;
	int bim3;
	int bim4;
	String nome; 
	
//	public int mediaAluno() {
//		int total = 0;
//		total += bim1;
//		total += bim2;
//		total += bim3;
//		total += bim4;
//		return total / 4;
//
//	}
	public int media() {
		int total = 0;
		total += bim1;
		total += bim2;
		total += bim3;
		total += bim4;
		return total / 4;

	}
	
//	public String passouDeAno() {
//		int media = mediaAluno();
//		if (media >= 60) {
//			return "Sim";
//		}
//		return "Não";
//		
//	}
	
	public String passouDeAno() {		
		if (media() >= 60) {
			return "Sim";
		}
		return "Não";
	}
	
	
}
