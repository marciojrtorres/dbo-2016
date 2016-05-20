package polimorfismo;
// Conta Poupança é uma Conta Corrente? 
//
public class ContaPoupanca extends ContaAbstrata {

	@Override
	public void ciclo() {
		// manipular o saldo pelos métodos públicos (indireto)
		// deposito(getSaldo() * 0.01);
		this.saldo *= 1.01; // 10.0
	}

}
