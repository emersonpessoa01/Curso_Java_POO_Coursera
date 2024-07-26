package org.coursera.calculo_imc;

public class Paciente {
	private double peso;
	private double altura;

	// Construtor
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	// Método para calcular IMC
	public double calcularIMC() {
		return peso / (altura * altura);
	}

	// Método para diagnosticar com base no IMC
	public String diagnostico() {
		double imc = calcularIMC();
		if (imc < 16) {
			return "Baixo peso muito grave";
		} else if (imc <= 16.99) {
			return "Baixo peso grave";
		} else if (imc <= 18.49) {
			return "Baixo peso";
		} else if (imc <= 24.99) {
			return "Peso normal";
		} else if (imc <= 29.99) {
			return "Sobrepeso";
		} else if (imc <= 34.99) {
			return "Obesidade grau I";
		} else if (imc <= 39.99) {
			return "Obesidade grau II";
		} else {
			return "Obesidade grau III (obesidade mórbida)";

		}
	}
}
