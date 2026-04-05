package modelos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		String Senha;
		
		System.out.println("Sistema de Entrega");
		System.out.println("Digite a senha de acesso: ");
		Senha = sc.next();
		
		for(int i = 3 ; i > 0 ; i--) {
			
			if (!Senha.equals("12345678")){
				System.out.println("Acesso Negado Tentativas Restantes : " + i );
				Senha = sc.next();
			
				
				}
			
		
		if(Senha.equals("12345678")){
			int opcao = 0;
			System.out.println("Seja Bem-Vindo");
			System.out.println("1. Cadastrar Nova Entrega");
			System.out.println("2. Sair");
			System.out.println();
			System.out.println("Escolhar uma opcao");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 1: 
			System.out.println("Dados do Endereco");
			
			System.out.print("Longradouro: ");
			String Longradouro = sc.nextLine();
			
			System.out.print("Complemento: ");
			String Complemento = sc.nextLine();
			
			System.out.print("Numero: ");
			String  Numero = sc.nextLine();
			
			System.out.print("CEP: ");
			String Cep = sc.nextLine();
			
			System.out.print("Cidade: ");
			String Cidade = sc.nextLine();
			
			System.out.print("Estado: ");
			String Estado = sc.nextLine();
			
			Endereco endEntrega = new Endereco(Longradouro, Complemento, Numero, Cep, Cidade, Estado );
			
			System.out.println("Dados do Produto");
			System.out.print("Nome do Produto: ");
			String NomeProduto = sc.nextLine();
			
			System.out.print("Descricao: ");
			String Descricao = sc.nextLine();
			
			System.out.print("Categoria: ");
			String Categoria = sc.nextLine();	
			
			
			System.out.print("Peso (KG): ");
			double peso = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Código de Rastreio: ");
			String Codigo = sc.nextLine();
			
			Mercadoria produto = new Mercadoria(NomeProduto, Descricao, Categoria, peso, Codigo, endEntrega);
			
			
			System.out.println();
			System.out.println("Sucesso: Mercadoria " + produto.getNome() + " Vinculado ao endereco em "+ endEntrega.getCidade()+"!");
			
			
			case 2:
				System.out.println("Saindo do Sistema...");
				break;
				
				default:
					System.out.println("Opcao Invalida!");
			
			
					
			}
			
		
		}
		
	}
	
	}
}

