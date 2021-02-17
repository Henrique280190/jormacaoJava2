//Gerente herda caracteristicas do funcionario
public class Gerente extends Funcionario implements Autenticavel {	
	
	
	private AutenticacaoUtil util;
	
	public Gerente() {
		util = new AutenticacaoUtil();
	}

	public double getBonificacao(){
		//System.out.println("Gerente tem PLR valor igual a salario!");
		return getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.util.autentica(senha);
		return autenticou;
	}

	
	
}
