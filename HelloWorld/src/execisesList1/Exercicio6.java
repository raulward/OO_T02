package execisesList1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número para verificar se é primo: ");
		int num = scanner.nextInt();
		int divCount = 0;

		int i;
		if (num >= 1) {
			for (i = 1; i <= num; i++) {
				int rest = num % i;
				if (rest == 0) {
					divCount += 1;
				}
			}
		}

		if (divCount <= 2 || num == 1) {
			System.out.println("O número é primo.");
		} else {
			System.out.println("O número nao é primo.");
		}
	}

}
