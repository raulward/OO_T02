package execisesList1;

import java.text.DecimalFormat;

public class Exercicio9 {

	public static void main(String[] args) {

		int fahreinheitTemperature = 50;
		DecimalFormat df = new DecimalFormat("#.##");
		double celsiusTemperature = 0;

		for (int i = 50; i <= 65; i++) {
			celsiusTemperature = (fahreinheitTemperature - 32) / 1.8;
			System.out.println("Temperatura em graus Fahreinheit: " + fahreinheitTemperature + " || "
					+ "Temperatura em graus Celsius: " + df.format(celsiusTemperature));
			System.out.println(
					"-------------------------------------------------------------------------------------------------");
			fahreinheitTemperature += 1;
		}

	}

}
