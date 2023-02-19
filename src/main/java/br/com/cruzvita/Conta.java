package br.com.cruzvita;

public class Conta {
	// Atributos
	private Cliente portador;
	private int numConta;
	private int agencia;
	private double saldo;
	
	// Métodos públicos
	@Override
	public String toString() { // toString
		return "\n ------------------ \n Informações do cliente " + portador + "\n Informações da conta \n Número da conta = " + numConta + "\n Agência = " + agencia + "\n Saldo = " + saldo + "\n ------------------";
	}

	// Métodos especiais (constructor) OBS: parte do método retirada para fazer com que o usuário forneça os dados da conta.
	
	public Conta(Cliente portador/*, int numConta, int agencia, double saldo*/) {
		super();
		this.portador = portador;
		/*this.numConta = numConta;
		this.agencia = agencia;
		this.saldo = saldo;*/
	}
	
	// Métodos especiais (getters e setters)

	public Cliente getPortador() {
		return portador;
	}


	public void setPortador(Cliente portador) {
		this.portador = portador;
	}


	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
	
	
	

	
	
	
}
