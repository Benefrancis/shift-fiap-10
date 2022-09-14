package br.com.fiap.shift.on;

import java.util.Scanner;

public class Opcoes {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("+++++++++++++   Bem vindo ao sistema!!    ++++++++++++++++++\n\n");
		System.out.println("Digite a opão desejada\n");
		System.out.println("[ 1 ] Consultar Saldo");
		System.out.println("[ 2 ] Sacar da Conta Corrente");
		System.out.println("[ 3 ] Sacar do Cartão de Crédito");
		System.out.println("[ 4 ] Seguro Residencial");
		System.out.println("[ 5 ] Seguro do Veículo");
		System.out.println("[ 6 ] Titulo de Captalização");
		System.out.println("[ 7 ] Investimentos");

		int opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Consultando saldo");
			break;
		case 2:
			System.out.println("Realizando saque da conta corrente");
			break;
		case 3:
			System.out.println("Realizando saque do cartão de crédito");
			break;
		case 4:
			System.out.println("Cadastrando Seguro Residencial");
			break;
		case 5:
			System.out.println("Cadastrando seguro do veículo");
			break;
		case 6:
			System.out.println("Cadastrando Titulo de Captalização");
			break;
		case 7:
			System.out.println("Realizando Investimento");
			break;
		default:
			System.out.println("Opção Inválida");
		}
		scanner.close();
	}
}
