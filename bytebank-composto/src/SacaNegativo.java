
public class SacaNegativo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		System.out.println(conta.getSaldo());
		System.out.println();
		System.out.println(conta.saca(200));		
		
	}

}
