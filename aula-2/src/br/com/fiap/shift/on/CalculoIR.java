package br.com.fiap.shift.on;

import java.util.Scanner;

/**
 * até R$ 1.903,98 - Isento - R$ 0 de R$ 1.903,99 a R$ 2.826,65 - 7,5% - R$
 * 142,80 de R$ 2.826,66 a R$ 3.751,05 - 15% - R$ 354,80 de R$ 3.751,06 a R$
 * 4.664,68 - 22,5% - R$ 636,13 acima de R$ 4.664,68 - 27,5% - R$ 869,36
 * 
 * @author Francis
 *
 */

public class CalculoIR {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o seu salário mensal");

		double salario = 0;
		double aliquota = 0;
		double valor = 0;

		while (salario == 0) {
			if (scanner.hasNextDouble()) {
				System.out.println("Informe o seu salário mensal");
				salario = scanner.nextDouble();
			}
		}

		if (salario <= 1903.98) {
			aliquota = 0;
		} else if (salario <= 2826.65) {
			aliquota = 7.5;
		} else if (salario <= 3751.05) {
			aliquota = 15;
		} else if (salario <= 4664.68) {
			aliquota = 22.5;
		} else {
			aliquota = 27.5;
		}

		System.out.printf("%.2f\n", aliquota);

		valor = salario * (aliquota / 100);

		System.out.printf("%s%.2f", "Imposto devido: R$ ", valor);
		scanner.close();
	}
}
