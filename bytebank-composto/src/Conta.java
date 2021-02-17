class Conta{	
	private double saldo;
	double agencia;
	double numero;
	Cliente titular;	
	
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
	
	public double getSaldo(){
		return this.saldo;
	}
	
}