import java.util.Random;
import java.util.Scanner;

/**
 *
 * Essa classe realiza sorteios
 * 
 * @author Ravi
 *
 */
public class Sorteio {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int sorteado = r.nextInt(2);
		// System.out.println(sorteado);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha um número");

		int numeroEscolhido = scanner.nextInt();

		while (numeroEscolhido != sorteado) {
			System.out.println("Escolha um número");
			numeroEscolhido = scanner.nextInt();
			if (numeroEscolhido > sorteado) {
				System.out.println("Menor");
			} else if (numeroEscolhido < sorteado) {
				System.out.println("Maior");
			} else {
				System.out.println("Igual");
			}
		}
		scanner.close();
	}
}