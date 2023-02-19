package br.com.cruzvita;


public class Cliente {
	// Atributos
	private String nome;
	private String cpf;
	private String sexo;
	
	// Métodos públicos
	@Override
	public String toString() { // toString
		return "\n Nome = " + nome + "\n CPF = " + cpf + "\n Sexo = " + sexo + "\n ------------------";
	}
	
	// Métodos especiais (constructor) OBS: Método retirado para fazer com que o usuário forneça os dados do cliente.
//	public Cliente(String nome, String cpf, String sexo) {
//		super();
//		this.nome = nome;
//		this.cpf = cpf;
//		this.sexo = sexo;
//	}
	
	// Métodos especiais (getters e setters)

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	
	
}
