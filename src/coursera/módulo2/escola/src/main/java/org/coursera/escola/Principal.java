package org.coursera.escola;

public class Principal {
	public static void main(String[] args) {
		Aluno guerra = new Aluno();
		guerra.nome = "Guerra";
		guerra.bim1 = 70;
		guerra.bim2 = 60;
		guerra.bim3 = 80;
		guerra.bim4 = 70;
		
		//Cálculo das médias
//		System.err.println("A media das notas é: "+ VerificadoraNotas.mediaAluno(guerra));
//		
//		//Verificar se o aluno passou de ano
//		System.out.println("Verificar se o aluno "+ guerra.nome + " passou: "+VerificadoraNotas.passouDeAno(guerra));
		
System.err.println("A media das notas é: "+ guerra.media());
		
		//Verificar se o aluno passou de ano
		System.out.println("Verificar se o aluno "+ guerra.nome + " passou: "+ guerra.passouDeAno());
	}
}