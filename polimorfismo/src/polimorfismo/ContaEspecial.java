package polimorfismo;

public class ContaEspecial extends ContaCorrente {

	// sobrescrevendo (redefinindo) o método saque
	@Override
	public void saque(double valor) {
		if (valor > this.saldo + 500.0) {
			throw new SaldoInsuficienteException();
		}
		this.saldo -= valor;
	}
	
	@Override
	public double getSaldoDisponivelSaque() {
		return super.getSaldoDisponivelSaque() + 500.0;
	}
	
}







