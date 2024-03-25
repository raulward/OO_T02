package execisesList1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Insira o nome do produto: ");
        String productName = scanner.nextLine();

        System.out.println("Insira o estoque total (quantidade de produtos): ");
        int productStock = scanner.nextInt();

        System.out.println("Insira o preco unitário do produto: ");
        float productPrice = scanner.nextFloat();

        float ammountWithoutDiscount = productStock * productPrice;
        System.out.println("Valor total de itens do estoque sem desconto: " + df.format(ammountWithoutDiscount));

        float discount;
        float ammountWithDiscount;

        if (productStock <= 5){
            discount = 0.98f;
            ammountWithDiscount = ammountWithoutDiscount * discount;
            System.out.println("Valor total de itens do estoque com desconto: " + df.format(ammountWithDiscount));
        } else if (productStock <= 10) {
            discount = 0.97f;
            ammountWithDiscount = ammountWithoutDiscount * discount;
            System.out.println("Valor total de itens do estoque com desconto: " + df.format(ammountWithDiscount));
        } else {
            discount = 0.95f;
            ammountWithDiscount = ammountWithoutDiscount * discount;
            System.out.println("Valor total de itens do estoque com desconto: " + df.format(ammountWithDiscount));
        }
	}

}
