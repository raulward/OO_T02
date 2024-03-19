package execisesList1;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Velocidade da via: ");
		int speedAvenue = scanner.nextInt();
		
		System.out.println("Velocidade do motorista: ");
		int speedDriver = scanner.nextInt();
		
		int speedDifference = speedDriver - speedAvenue;
		
		if (speedDifference <= 10 && speedDifference > 0) {
            System.out.println("Multa aplicada de R$ 50,00");
        } else if (speedDifference <= 30 && speedDifference >= 11) {
            System.out.println("Multa aplicada de R$ 100,00");
        } else if (speedDifference >= 31) {
            System.out.println("Multa aplicada de R$ 200,00");
        } else {
        	System.out.println("Nenhuma multa aplicada");
        }
		
		
	}

}
