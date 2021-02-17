class Conta{	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero){
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		total++;
				
	}
	
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
	
	public int getNumero(){
		return numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public int getAgencia(){
		return agencia;
	}
	
	public void setAgencia(int agencia){
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}

		
}