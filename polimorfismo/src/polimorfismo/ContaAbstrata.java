package polimorfismo;
// conceito básico de OO: lidar com abstrações
    // abstrata: não pode ser instanciada!
public abstract class ContaAbstrata {
	
	// PUBLIC acaba quebrando o ENCAPSULAMENTO
	// public double saldo;
	
	// PROTECTED: atributo acessível às subclasses (filhas)
	protected double saldo;
	// fazer "protected" criteriosamente!!!

	public double getSaldo() { return saldo; }
	
	public double getSaldoDisponivelSaque() {
		return saldo;
	}

	public void deposito(double valor) { saldo += valor; }

	public void saque(double valor) {
		if (valor > saldo) throw new SaldoInsuficienteException();
		saldo -= valor;
	}

		// todas as Contas têm um Ciclo mas a implementação depende
	public abstract void ciclo(); // um CONTRATO
	// todas as classes concretas 
	// de Conta deverão implementar ciclo():void
	
}














