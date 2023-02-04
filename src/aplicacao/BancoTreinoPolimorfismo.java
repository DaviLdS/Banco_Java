package aplicacao;

import entidades.Conta;
import entidades.ContaPoupanca;

public class BancoTreinoPolimorfismo {

	public static void main(String[] args) {
		Conta x = new Conta(1020,"Alex",1000.0);
		Conta y = new ContaPoupanca(1023,"Maria",1000.0,0.01);
		
		x.retirada(50.0);
		y.retirada(50.0);
		
		System.out.println(x.getBalanco());
		System.out.println(y.getBalanco());
	}
}
