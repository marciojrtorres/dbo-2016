package referencias;

public class Main {
	public static void main(String[] args) {
		No primeiro = new No("str a");
		No n = new No("str b", primeiro);
		n = new No("str c", n);
		n = new No("str d", n);
		n = new No("str e", n);
		
		n = primeiro;
		
		while (n != null) {
			System.out.println(n.getValor());
			n = n.getProximo();
		}
		
		
	}
}






