public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(167 , 939699);
		Conta conta2 = new Conta(30, 556645);
		
		System.out.println(conta.getAgencia());
		System.out.println(Conta.getTotal());
	}

}
