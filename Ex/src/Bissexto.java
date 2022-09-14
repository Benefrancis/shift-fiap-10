import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um ano (no formato YYYY contendo apenas números):");
		int ano = sc.nextInt();
		
		// Condição para ser considerado ano bissexto
		boolean condicao = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);

		if (condicao) {
			System.out.println("O ano " + ano + " é bissexto!");
		} else {
			System.out.println("O ano " + ano + " não é bissexto!");
		}
		sc.close();
	}

}
