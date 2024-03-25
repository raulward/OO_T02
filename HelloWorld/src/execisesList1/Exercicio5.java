package execisesList1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userCode = 1234;
		int userPassword = 9999;
		int userTryCode;
		int userTryPassword = 0;

		do {
			System.out.println("Digite o código de usuário: ");
			userTryCode = scanner.nextInt();
			if (userTryCode == userCode) {
				System.out.println("Digite a senha: ");
				userTryPassword = scanner.nextInt();
				if (userTryPassword == userPassword) {
					System.out.println("Acesso permitido");
				} else {
					System.out.println("Acesso negado! Senha incorreta.");
				}
			} else {
				System.out.println("Acesso negado! Código de usuário incorreto.");
			}

		} while (userTryPassword != userPassword);

	}

}
