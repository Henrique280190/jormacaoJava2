
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(30 , 681456);
		Cliente henrique = new Cliente();
		henrique.setNome("Henrique");
		henrique.setCPF("40215375890");
		henrique.setProfiss�o("Programador");
		
		conta.setTitular(henrique);
		//conta.setAgencia(30);
		//conta.setNumero(681456);
		
		System.out.println(henrique.getNome());
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
	}

}
