package org.coursera.calculo_imc;

public class Principal {

	public static void main(String[] args) {
		// Criação de três instâncias de Classe Paciente
		Paciente paciente1 = new Paciente(70, 1.75);
		Paciente paciente2 = new Paciente(85, 1.80);
		Paciente paciente3 = new Paciente(95,1.60);
		
		// Impressão do resultado dos métodos criados
        System.out.println("Paciente 1:");
        System.out.println("IMC: " + paciente1.calcularIMC());
        System.out.println("Diagnóstico: " + paciente1.diagnostico());

        System.out.println("Paciente 2:");
        System.out.println("IMC: " + paciente2.calcularIMC());
        System.out.println("Diagnóstico: " + paciente2.diagnostico());

        System.out.println("Paciente 3:");
        System.out.println("IMC: " + paciente3.calcularIMC());
        System.out.println("Diagnóstico: " + paciente3.diagnostico());
		

	}

}
