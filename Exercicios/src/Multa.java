import java.util.Scanner;

public class Multa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a velocidade do veículo: ");

		int velocidadeDoVeiculo = sc.nextInt();
		System.out.println("Infome a velocidade máxima da via: ");

		int valocidadeMaxima = sc.nextInt();

		double multa = 0;
		int velocidade = velocidadeDoVeiculo - valocidadeMaxima;

		if (velocidade > 31) {
			multa = 300;
			System.out.println(multa);
		} else if (velocidade >= 11) {
			multa = 100;
			System.out.println(multa);
		} else if (velocidade > 0) {
			multa = 50;
			System.out.println(multa);
		} else {
			System.out.println("Parabéns por respeitar as leis de trânsito!");
		}
		sc.close();
	}

}
