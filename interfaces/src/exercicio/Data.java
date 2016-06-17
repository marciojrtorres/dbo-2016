package exercicio;

public class Data implements IData {

	private int dia = 1;
	private int mes = 1;
	private int ano = 2000;
	
	private FormataData formatador = 
				new FormataDataPadrao();
	
	@Override
	public void setDia(int dia) {
		this.dia = dia;
	}

	@Override
	public void setMes(int mes) {
		this.mes = mes;
	}

	@Override
	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public int getDia() {
		return dia;
	}

	@Override
	public int getMes() {
		return mes;
	}

	@Override
	public int getAno() {
		return ano;
	}

	@Override
	public String get() {
		return formatador.formatar(dia, mes, ano);
	}
	
	@Override
	public String toString() {
		return get();
	}

	@Override
	public void setFormataData(FormataData fmt) {
		this.formatador = fmt;
	}

}














