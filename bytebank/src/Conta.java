class Conta{	
	double saldo;
	double agencia;
	double numero;
	String titular;	
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}else{
			return false;
		}
	}
	
	
	public boolean transferi(double valor, Conta destino) {
		if (this.saldo >=  valor){
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else{
			return true;
		}
			
	}
	
}