package exercicio;

public class FormataDataPadrao implements FormataData {

	@Override
	public String formatar(int dia, int mes, int ano) {
		return dia + "/" + mes + "/" + ano;
	}

}
