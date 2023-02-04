package aplicacao;

import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class BancoTreinoUpDownCasting {

	public static void main(String[] args) {
		Conta acc = new Conta(1001, "Alex", 0.0);
		ContaCorrente bacc = new ContaCorrente(1002, "Maria", 0.0, 500.0);
		// Upcasting
		Conta acc1 = bacc;
		Conta acc2 = new ContaCorrente(1003, "Bob", 0.0, 200.0);
		Conta acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		// Downcasting
		ContaCorrente acc4 = (ContaCorrente) acc2;
		acc4.emprestimo(100.0);
		//Não se pode fazer isso porém o compilador não sabe o dev tem que saber.
		//ContaDeNegocio acc5 = (ContaDeNegocio) acc3;
		//Deve ser feito como abaixo.
		if(acc3 instanceof ContaCorrente ) {
			ContaCorrente acc5 = (ContaCorrente) acc3;
			acc5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}
		if(acc3 instanceof ContaPoupanca ) {
			ContaPoupanca acc5 = (ContaPoupanca) acc3;
			acc5.atualizarSaldo();
			System.out.println("Atualizar Saldo!");
		}
		System.out.println(acc1);
		System.out.println(acc);
	}
}
