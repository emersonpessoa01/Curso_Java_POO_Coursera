package org.coursera.PilhaEncapsulada;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		System.out.println("-=-=-=-=-Empilhando-=-=-=-=-");
		p.empilhar("Emerson");
		p.empilhar("Luciene");
		p.empilhar("Fernanda");
		System.out.println("Topo: " + p.topo());
		System.out.println("Tamanho: " + p.tamanho());
		
//		p.setTopo(6);
		Object[] arrayElementos = p.getElementos();
		System.out.println(arrayElementos.length);
		arrayElementos[1] = "OUTRO";
		
		//Desempilhando
		System.out.println("-=-=-=-=-Desempilhando-=-=-=-=-");
		System.out.println("Desempilhar: " + p.desempilhar().toString().toUpperCase());
		System.out.println("Topo: " + p.topo().toString().toUpperCase());
		System.out.println("Tamanho: " + p.tamanho());
		
		System.out.println(p.getElementos().length);
	}

}
