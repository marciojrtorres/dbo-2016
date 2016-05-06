package oo;

public class Main {
	public static void main(String[] args) {
		// 5! = 120
		// ;((0,1),(1,1),(2,2),(3,6),(4,24),(5,120))
		// 1 2 3  4   5   6
        // 1 2 6 24 120 720	
//		int n = 5;
//		int r = 1;
//		for (int i = 1; i <= n; i++) {
//			r = r * i;
//		}
//		System.out.println(r); // 120

		// Especificação: como funciona o objeto fatorial
		// entradas e saídas e como interagir
		Fatorial fatorial = new Fatorial(5);
		
		while (fatorial.proximo()) {
			// fatorial.n++; // n pode ser final
			// fatorial.i++; // i deve ser private
			// System.out.println(fatorial.valor());
			// fatorial.valor = 52; // valor deve ser private
			System.out.println(fatorial.valor()); // toString()
		}
		
		System.out.println(fatorial.valor());
		
		
		Fatorial fat2 = new Fatorial(4);	
		fat2.proximo(); fat2.proximo(); 
		fat2.proximo(); fat2.proximo();
		fat2.proximo(); fat2.proximo();
		fat2.proximo(); fat2.proximo();
		fat2.proximo(); fat2.proximo();
		System.out.println(fat2); // fat de 4
		
		Fatorial fat3 = new Fatorial(6); // 720
		// método que retorna o valor final
		// sem necessidade de próximos
		System.out.println(fat3.valorFinal());
		
		
		Fatorial fat4 = new Fatorial(7);
		fat4.ultimo(); // proximo()'s até o limite
		System.out.println(fat4.valor());
		
		
		
		
		
		
		// métodos de consulta
		// não devem alterar estado
		// é garantido chamadas subsequentes
		// que não há mudanças.
		// System.out.println(fatorial.valor()); // ?
		// System.out.println(fatorial.valor()); // ?
		
		
		
		
		
		
		
		
		
		
		
	}
}







