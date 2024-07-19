package org.coursera.compras;

public class CompraParcelada extends Compra {
	private int quantidadeParcelas;
	private double jurosMensal;

	public CompraParcelada(double valor, int quantidadeParcelas, double jurosMensal) {
		super(valor);
		this.quantidadeParcelas = quantidadeParcelas;
		this.jurosMensal = jurosMensal;
	}

	@Override
	public double total() {
		return this.valor * Math.pow(1 + this.jurosMensal / 100, this.quantidadeParcelas);
	}
}
