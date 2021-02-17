package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {
		//Full qualified name FQN
		ContaCorrente cc = new ContaCorrente(30, 68145);
		cc.deposita(100.0);
		
		
		ContaPoupanca cp = new ContaPoupanca(35, 60560);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
