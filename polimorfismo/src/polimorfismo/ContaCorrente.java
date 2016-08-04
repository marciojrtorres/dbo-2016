package polimorfismo;

// concreta! (não-abstrata)
public class ContaCorrente extends ContaAbstrata {

	@Override
	public void ciclo() {
		this.saldo -= 10.0;
	}


}
