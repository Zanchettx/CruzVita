package br.com.cruzvita;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ProgramaBanco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Cliente> clientes = new ArrayList<>();
		List<Conta> contas = new ArrayList<>();
		List<Banco> bancos = new ArrayList<>();
		
		System.out.println("Para iniciar o programa digite [1]");
		System.out.println("Parar encerrar o programa digite [2]");
		int r = sc.nextInt();
		
		if (r == 1) {
			System.out.println("Quantas contas você quer criar? ");
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				Cliente cliente = new Cliente();
				Conta conta = new Conta(cliente);
				Banco banco = new Banco(conta);
				
				sc.nextLine();
				System.out.println("Informe o nome do seu banco: ");
		  		banco.setNomeBanco(sc.nextLine());
				
				System.out.println("Informe seu nome: ");
				cliente.setNome(sc.nextLine());
				System.out.println("Informe seu cpf: ");
				cliente.setCpf(sc.nextLine());
				System.out.println("Informe seu sexo: ");
				cliente.setSexo(sc.nextLine());
				
				System.out.println("Informe o número da sua conta: ");
				conta.setNumConta(sc.nextInt());
				System.out.println("Informe sua agência: ");
				conta.setAgencia(sc.nextInt());
				System.out.println("Informe um valor inicial para ser depositado: ");
				conta.setSaldo(sc.nextDouble());
				
		  		System.out.println("Conta criada com sucesso!");
		  		System.out.println("-------------------------------");
				
		  		clientes.add(cliente);
		  		contas.add(conta);
				bancos.add(banco);
				
				System.out.println("Total de contas cadastradas: "+ bancos.size());
				System.out.println("-------------------------------");
			}
			
			
			System.out.println(bancos.get(0));
			System.out.println(bancos.get(1));
			
			System.out.println("Valor inicial banco 1: " + bancos.get(0).getConta().getSaldo());
			System.out.println("Valor inicial banco 2: " + bancos.get(1).getConta().getSaldo());
			
			bancos.get(0).depositar(100);
			System.out.println("Saldo banco 1 após depósito: " + bancos.get(0).getConta().getSaldo());
			
			bancos.get(0).sacar(50);
			System.out.println("Saldo banco 1 após saque: " + bancos.get(0).getConta().getSaldo());
			
			System.out.println("-------");
			
			bancos.get(1).depositar(10);
			System.out.println("Saldo banco 2 após depósito: " + bancos.get(1).getConta().getSaldo());
			
			bancos.get(1).sacar(5);
			System.out.println("Saldo banco 2 após saque: " + bancos.get(1).getConta().getSaldo());
			
			System.out.println("Operação de transferência de 30 reais do banco 1 ao 2: ");
			
			bancos.get(0).transferir(bancos.get(1).getConta(), 30.0);
			
			System.out.println("Saldo banco 1 após transferência: " + bancos.get(0).getConta().getSaldo());
			
			System.out.println("Saldo banco 2 após transferência: " + bancos.get(1).getConta().getSaldo());
			
		} else {
			System.out.println("Programa encerrado.");
		}
		

		sc.close();

	}

}
