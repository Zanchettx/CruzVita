package br.com.cruzvita;

public interface InterfaceBanco {
	// M�todos abstratos
	void depositar(double valor);
	void sacar(double valor);
	void transferir(Conta conta, double valor);
	
}
