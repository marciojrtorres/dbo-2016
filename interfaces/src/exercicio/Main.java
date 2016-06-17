package exercicio;

public class Main {
	public static void main(String[] args) {
		// criar uma inteface para data
		// quer permita informar dia, mes e ano (pelo menos)
		// "printar" a data
		
		// implementar a interface e fazer testes
	
		IData d = new Data();
		d.setDia(17);
		d.setMes(6);
		d.setAno(2016);
		
		System.out.println(d.get());
		System.out.println(d.get().equals("17/6/2016"));
		
		d.setFormataData(new FormataDataMesTextoCurto());
		
		System.out.println(d.get());
		System.out.println(d.get().equals("17/jun/2016"));
		
		// ((dia < 10 ? "0" : "") + dia)
		// Formato ISO
		
		System.out.println(d.get()); // 2016-06-17
		System.out.println(d.get().equals("2016-06-17"));
		
		
		// Princípio de Projeto OO:
		// Open/Close Principle (OCP)
		// Princípio Aberto/Fechado
		// As classes devem estar abertas
		// à extensão de funcionalidade
		// mas fechada para modificação!
		// Propósito: Minimizar a mudança!
		// Em vez: atuar na criação em vez de alteração.
		
		
		
		
		
		
		
		
		
	}
}
