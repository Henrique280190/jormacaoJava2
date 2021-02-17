package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente(30, 681456);
		
		contaCorrente.deposita(200.0);
		contaCorrente.saca(190.00);
		
		System.out.println(contaCorrente.getSaldo());

	}

}
