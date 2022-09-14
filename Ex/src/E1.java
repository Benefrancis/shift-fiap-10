import java.util.Scanner;

//@formatter:off
/**
 * 
 * Calcular a multa: Leia a velocidade de um carro e a velocidade máxima para a via: 
 * 
 * 1. Informe 50 reais se estiver até 10km/h acima; 
 * 2. Informe 100 reais se estiver entre 11km/h e 30km/h acima; 
 * 3. Informe 300 reais se estiver acima de  31km/h acima.
 * 
 * @author Francis
 *
 */
//@formatter:on
public class E1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a velocidade do carro em KM/h(apenas números): ");
		int velocidadeDoCarro = sc.nextInt();

		System.out.println("Informe a velocidade máxima para a via em KM/h(apenas números): ");
		int velocidadeMaximaDaVia = sc.nextInt();

		double multa = 0;

		int calculo = velocidadeDoCarro - velocidadeMaximaDaVia;

		if (calculo > 31) {
			// Informe 300 reais
			multa = 300;
			System.out.println("Multa de R$  " + multa
					+ "  por transitar em velocidade superior à permitida para a via.\nVelociade da via: "
					+ velocidadeMaximaDaVia + " velocidade do seu carro: " + velocidadeDoCarro
					+ "\nTransitou em 31km/h acima da velocidade máxima permitida.  ");
		} else if (calculo > 11) {
			// entre 11km/h e 30km/h acima
			multa = 100;
			System.out.println("Multa de R$ " + multa
					+ "   por transitar em velocidade superior à permitida para a via.\nVelociade da via: "
					+ velocidadeMaximaDaVia + " velocidade do seu carro: " + velocidadeDoCarro
					+ "\nTransitou entre 11km/h e 30km/h acima da velocidade máxima permitida.");
		} else if (calculo >= 1) {
			// até 10km/h acima
			multa = 50;
			System.out.println("Multa de R$ " + multa
					+ "  por transitar em velocidade superior à permitida para a via.\nVelociade da via: "
					+ velocidadeMaximaDaVia + " velocidade do seu carro: " + velocidadeDoCarro
					+ "\nTransitou até 10km/h acima da velocidade máxima permitida.");
		} else {
			System.out.println("Parabéns por respeitar as leis de trânsito!");
		}

	}
}
