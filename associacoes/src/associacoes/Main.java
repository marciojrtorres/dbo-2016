package associacoes;

public class Main {

	public static void main(String[] args) {
		// aplicativo para gestão de evento
		// ex.: Palestra
		// ALT + SHIFT + R
		Palestra palestraMobile = 
				new Palestra("Desenvolvimento Mobile", 5);
		System.out.println(palestraMobile); // syso
		// palestraMobile.setVagas(8);
		System.out.println(palestraMobile);
		
		Participante luana = 
				new Participante("11122233344", "Luana");
		Participante thalis = 
				new Participante("99988877722", "Thalis");
		
		palestraMobile.inscrição(luana);
		System.out.println(palestraMobile.toString());
		palestraMobile.inscrição(thalis);
		// palestraMobile.inscrição(thalis);
		System.out.println(palestraMobile);
		
		Participante thalis2 =
				new Participante("99988877722", "Thalis Sartorio");
		
		// Já Inscrito.
		// palestraMobile.inscrição(thalis2);
		// System.out.println(palestraMobile);
		
		// vagas disponíveis?
		// propriedade (não é um atributo, pois é calculado)
		System.out.println(palestraMobile.getVagasDisponiveis());
		
		// Opção ignorada:
		// Participante não tem vetor de Palestra
		// luana.inscrição(palestraMobile);
		
		Oficina o = 
				new Oficina("minicurso de troca de lâmpada",
						    Curso.Eletrotecnica);
		o.inscrição(thalis);
		System.out.println(o);
		
	}

}










