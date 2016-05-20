package polimorfismo;

public class Main {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		System.out.println(cc.getSaldo()); // 0.0
		cc.deposito(500.0);
		System.out.println(cc.getSaldo()); // 500.0
		cc.saque(100.0);
		System.out.println(cc.getSaldo()); // 400.0
		//cc.saque(1000.0);
		cc.ciclo(); // descontar 10.0
		System.out.println(cc.getSaldo()); // 390.0
		
		ContaPoupanca cp = new ContaPoupanca();
		System.out.println(cp.getSaldo()); // 0.0
		cp.deposito(1100.0);
		cp.saque(100.0);
		System.out.println(cp.getSaldo()); // 1000.0
		cp.ciclo();
		System.out.println(cp.getSaldo()); // 1010.0
		System.out.println(cp.getSaldoDisponivelSaque());
		
		ContaEspecial ce = new ContaEspecial();
		ce.deposito(100.0);
		ce.saque(200.0);
		System.out.println(ce.getSaldo()); // -100.0
		System.out.println(ce.getSaldoDisponivelSaque()); // 400.0
		ce.saque(ce.getSaldoDisponivelSaque()); 
		System.out.println(ce.getSaldo()); // - 500.0
		System.out.println(ce.getSaldoDisponivelSaque()); // 0.0
		
		
	}
}




