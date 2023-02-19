package br.com.cruzvita;

public class Banco implements InterfaceBanco {
	
	private Conta conta;
	private String nomeBanco;
	
	public Banco(Conta conta) {
		this.conta = conta;
	}
	
	@Override
	public String toString() {
		return " Banco " + nomeBanco + conta;
	}



	@Override
	public void sacar(double valor) {
		if (this.conta.getSaldo() >= valor) {
			this.conta.setSaldo(this.conta.getSaldo() - valor);
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saque não realizado pois o valor de saque é maior que o saldo!");
		}
	}
	
	@Override
	public void depositar(double valor) {
		conta.setSaldo(conta.getSaldo() + valor);
		System.out.println("Depósito realizado com sucesso!");
	}
	
	@Override
	public void transferir(Conta conta, double valor) {
		if (this.conta.getSaldo() >= valor) {
			this.conta.setSaldo(this.conta.getSaldo() - valor);
			conta.setSaldo(conta.getSaldo() + valor); // ANOTAÇÃO: this se refere ao atributo da própria classe.
		}
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	
	
	
	
}
