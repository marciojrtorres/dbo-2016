package exercicio;

public interface IData {
	
	public void setFormataData(FormataData fmt);
	
	public void setDia(int dia);
	public void setMes(int mes);
	public void setAno(int ano);
	
	public int getDia();
	public int getMes();
	public int getAno();
	
	public String get();

}
