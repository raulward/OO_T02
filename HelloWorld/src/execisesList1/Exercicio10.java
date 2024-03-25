package execisesList1;

import java.text.DecimalFormat;

public class Exercicio10 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		int num1 = 1;
		int num2 = 1;
		double operation;
		double sum = 0;

		while (true) {
			if (num1 == 99 && num2 == 50)
				break;
			operation = (double) num1 / num2;
			sum += operation;
			num1 += 2;
			num2 += 1;

		}
		System.out.println("Soma: " + df.format(sum));

	}

}
