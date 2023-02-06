// entidad
public class  Cuenta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total = 0;
	
	
	/*public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
		System.out.println("Se van creando: " + total + " cuentas");
	}*/
	
	// No retorna valor
	public  void depositar(double valor) throws MiException{
		this.saldo += valor;
	}
	
	// Retorna valor
	void  retirar (double valor) throws MiException{
		if (this.saldo < valor) {
			throw new MiException();
		}
		
		this.saldo -= valor;
	
	}
	
	public boolean transferir(double valor, Cuenta cuenta) throws MiException{
		if(this.saldo >= valor) {
			this.retirar(valor);
			cuenta.depositar(valor);
			return true;
		}
		return false;
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	/*
	public void setAgencia(int agencia){
		if(agencia > 0) {
			this.agencia = agencia;
		}else {
			System.out.println("No se permiten valores negativos");
		}
	}
	*/
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
}
