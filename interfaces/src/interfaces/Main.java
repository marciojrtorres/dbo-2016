package interfaces;

public class Main {
	public static void main(String[] args) {
		// System.out.println("TESTE");
		
		IBox box = new Box(); // nenhuma caixa foi instanciada
		
		System.out.println(box.isEmpty() == true);
		System.out.println(box.get() == null);
		
		box.put("#InfoEhMais");
		
		System.out.println(box.isEmpty() == false);
		// get retira o objeto
		System.out.println(box.get().equals("#InfoEhMais"));
		
		System.out.println(box.isEmpty() == true);
		System.out.println(box.get() == null);

		box.put(null);
		System.out.println(box.isEmpty() == true);
		System.out.println(box.get() == null);
		
		box.put("DBO");
		box.put("Química");
		
		System.out.println(box.isEmpty() == false);
		System.out.println(box.get().equals("DBO"));
		
	}
}







