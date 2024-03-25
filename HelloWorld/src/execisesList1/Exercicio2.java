package execisesList1;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um caracter: ");
        char c = scanner.next().charAt(0);

        if (Character.isDigit(c)){
            System.out.println("O caracter é numerico.");
        } else if (Character.isLetter(c)){
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                System.out.println("O caracter é uma vogal");
            } else {
                System.out.println("O caracter é uma consoante");
            }
        } else {
            System.out.println("O caracter é de outro tipo");
        }
		
	}

}
