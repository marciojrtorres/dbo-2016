package oo;

public class Fatorial {
	
	public final int n; // atributo/campo/field do objeto
	private int i = 0; // atributo privado / só o obj pode acessar
	private int valor = 1;
	
	public int valor() { // para leitura do valor
		return this.valor;
	}

	public Fatorial(int n) { // variável local 
		this.n = n;
	}

	public boolean proximo() {
		if (i++ < n) {
			valor = valor * i;
			return true;
		}
		return false;
		// return i++ <= n; // return 1 <= 5; i = i + 1;
	}
	
	public void ultimo() {
		while (this.proximo());
	}
	
	public int valorFinal() {
		// while (this.proximo());
		this.ultimo();
		return this.valor;
	}
	
	@Override
	public String toString() {
		return valor + "";
	}

	



}








