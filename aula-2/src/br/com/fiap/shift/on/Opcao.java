package br.com.fiap.shift.on;

import java.util.Scanner;

public class Opcao {

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

		if (opcao == 1) {
			System.out.println("Consultando saldo");
		} else {
			if (opcao == 2) {
				System.out.println("Realizando saque da conta corrente");
			} else {
				if (opcao == 3) {
					System.out.println("Realizando saque do cartão de crédito");
				} else {
					if (opcao == 4) {
						System.out.println("Cadastrando Seguro Residencial");
					} else {
						if (opcao == 5) {
							System.out.println("Cadastrando seguro do veículo");
						} else {
							if (opcao == 6) {
								System.out.println("Cadastrando Titulo de Captalização");
							} else {
								if (opcao == 7) {
									System.out.println("Realizando Investimento");
								} else {
									System.out.println("Opção Inválida");
								}
							}
						}
					}
				}
			}
		}
		scanner.close();
	}
}
