package aplicacao;

import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class BancoTreinoOverride {

	public static void main(String[] args) {
		Conta acc1 = new Conta(1001, "Alex", 1000.0);
		acc1.retirada(200.0);
		System.out.println(acc1.getBalanco());
		
		Conta acc2 = new ContaPoupanca(1002, "Maria", 1000.0,0.01);
		acc2.retirada(200.0);
		System.out.println(acc2.getBalanco());
		
		Conta acc3 = new ContaCorrente(1003, "Bob", 1000.0,500.00);
		acc3.retirada(200.0);
		System.out.println(acc3.getBalanco());
	}
}
