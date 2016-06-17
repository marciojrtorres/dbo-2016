package referencias;

public class No {

	private Object valor;
	private No proximo;
	
	public No(Object valor) {
		this.valor = valor;
	}
	
	public No(Object valor, No anterior) {
		this.valor = valor;
		anterior.proximo = this;
	}
	
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	
	
}
