package execisesList1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira data no formato dd mm aaaa: ");
        int day1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int year1 = scanner.nextInt();

        System.out.println("Digite a segunda data no formato dd mm aaaa: ");
        int day2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int year2 = scanner.nextInt();

        if ((year1 > year2) || (year1 == year2 && month1 > month2) || (year1 == year2 && month1 == month2 && day1 > day2)){
            System.out.println("A data: " + day1 + "/" + month1 + "/" + year1 + " é maior.");            
        } else if ((year2 > year1) || (year2 == year1 && month2 > month1) || (year2 == year1 && month2 == month1 && day2 > day1)) {
            System.out.println("A data: " + day2 + "/" + month2 + "/" + year2 + " é maior.");
        } else {
            System.out.println("As datas sao iguais.");
        }

	}

}
