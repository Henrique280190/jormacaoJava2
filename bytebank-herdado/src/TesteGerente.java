
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Alessandra");
		g1.setCPF("36559558800");
		g1.setSalario(5000.00);
		
//		System.out.println(g1.getNome());
//		System.out.println(g1.getCPF());
//		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		
		boolean autenticou = g1.autentica(2222);		
		
		//System.out.println(autenticou);
		//System.out.println(g1.getBonificacao());
	}

}
