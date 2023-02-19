package br.com.cruzvita;

public interface InterfaceBanco {
	// Métodos abstratos
	void depositar(double valor);
	void sacar(double valor);
	void transferir(Conta conta, double valor);
	
}
