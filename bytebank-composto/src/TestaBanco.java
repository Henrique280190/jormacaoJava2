
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente henrique = new Cliente();
		henrique.nome = "Henrique Burgos";
		henrique.CPF = "40215375890";
		henrique.profiss�o = "Desenvolvedor";
		
		Conta contaHenrique = new Conta();
		contaHenrique.deposita(100);
		
		contaHenrique.titular = henrique;
		
		System.out.println(contaHenrique.titular.nome);
		
	
	}

}
