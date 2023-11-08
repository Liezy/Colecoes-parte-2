package pacote;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PessoaFisica pessoa1 = new PessoaFisica("Eliezer1", "endereço1", "telefone1", "cpf");
		PessoaJuridica pessoa2 = new PessoaJuridica("Eliezer2", "endereço2", "telefone2", "cnpj");
		
		System.out.println("---------PESSOA FISICA------------");
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Endereço: " + pessoa1.getEndereco());
		System.out.println("Telefone: " + pessoa1.getTelefone());
		System.out.println("CPF: " + pessoa1.getCpf());
		
		System.out.println("---------PESSOA Juridica------------");
		System.out.println("Nome: " + pessoa2.getNome());
		System.out.println("Endereço: " + pessoa2.getEndereco());
		System.out.println("Telefone: " + pessoa2.getTelefone());
		System.out.println("CPF: " + pessoa2.getCnpj());
		

	}

}
