package br.com.cruzvita;

public class Conta {
	// Atributos
	private Cliente portador;
	private int numConta;
	private int agencia;
	private double saldo;
	
	// M�todos p�blicos
	@Override
	public String toString() { // toString
		return "\n ------------------ \n Informa��es do cliente " + portador + "\n Informa��es da conta \n N�mero da conta = " + numConta + "\n Ag�ncia = " + agencia + "\n Saldo = " + saldo + "\n ------------------";
	}

	// M�todos especiais (constructor) OBS: parte do m�todo retirada para fazer com que o usu�rio forne�a os dados da conta.
	
	public Conta(Cliente portador/*, int numConta, int agencia, double saldo*/) {
		super();
		this.portador = portador;
		/*this.numConta = numConta;
		this.agencia = agencia;
		this.saldo = saldo;*/
	}
	
	// M�todos especiais (getters e setters)

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
