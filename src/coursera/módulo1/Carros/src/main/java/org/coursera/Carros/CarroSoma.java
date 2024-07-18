package org.coursera.Carros;

public class CarroSoma extends CarroDeCorrida {
	private int potencia;
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.nome = nome;
		this.potencia = potencia;
	}

	@Override
	public void acelerar() {
		velocidade += potencia;
		if(velocidade > velocidadeMaxima) {
			velocidade = velocidadeMaxima;
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//	public void imprimir() {
//		System.out.println("O carro " + nome + " está a velocidade de " + getVelocidade() + " km/h");
//	}
	
	

}
