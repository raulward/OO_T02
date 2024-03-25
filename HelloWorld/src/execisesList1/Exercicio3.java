package execisesList1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor do coeficiente A: ");
		double coeficienteA = scanner.nextDouble();

		System.out.println("Digite o valor do coeficiente B: ");
		double coeficienteB = scanner.nextDouble();

		System.out.println("Digite o valor do coeficiente C: ");
		double coeficienteC = scanner.nextDouble();

		double delta = (coeficienteB * coeficienteB) - (4 * coeficienteA * coeficienteC);
		double raiz1 = 0;
		double raiz2 = 0;

		if (delta >= 0) {
			raiz1 = ((coeficienteB * -1) + Math.sqrt(delta)) / (2 * coeficienteA);
			raiz2 = ((coeficienteB * -1) - Math.sqrt(delta)) / (2 * coeficienteA);
			System.out.printf("\nAs raízes da funcao sao: %f e %f", raiz1, raiz2);
		} else {
			System.out.println("Raízes nao podem ser definidas, delta < 0");
		}

	}

}
