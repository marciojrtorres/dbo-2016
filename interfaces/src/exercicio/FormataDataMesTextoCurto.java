package exercicio;

public class FormataDataMesTextoCurto implements FormataData {
	// CONSTANTE
	private static final String[] MESES =
		{"jan", "fev", "mar", 
		 "abr", "mai", "jun",
		 "jul", "ago", "set",
		 "out", "nov", "dez"};
	
	@Override
	public String formatar(int dia, int mes, int ano) {
		return dia + "/" + MESES[mes - 1] + "/" + ano;
	}

}







