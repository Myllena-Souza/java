package conversor;

import java.util.Scanner;
import java.text.DecimalFormat;


public class ConversorDeTemperatura {
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("----- CONVERSOR DE TEMPERATURA -----");
			
			System.out.println("Qual conversão gostaria de fazer?");
			System.out.println("[1] - Celcius °C para Fahrenheit °F");
			System.out.println("[2] - Fahrenheit °F para Celcius °C para ");
			System.out.println("[0] - Sair do conversor. ");
			
			System.out.println("Digite qual conversão dejesa fazer: ");
			int operacao =scanner.nextInt();
			
			System.out.println("Digite a temperatura para conversão: ");
			float temp = scanner.nextInt();
			
			
			
			if (operacao == 1) {
				double F = 0;
				F = (temp * 9.0 / 5.0) + 32;
				
				DecimalFormat formato = new DecimalFormat("#.#"); 
				String fFormatado = formato.format(F);
				
				System.out.println(temp + "°C convertido para Fahrenheit: " + fFormatado + "°F");
				System.out.println("Operação finalizada.");
				System.exit(0);
			}
			else if (operacao == 2) {
				double C = 0;
				C = (temp - 32) / 1.8;
				DecimalFormat formato = new DecimalFormat("#.#"); 
				String cFormatado = formato.format(C);
				
				System.out.println(temp + "°F convertido para Celcius: " + cFormatado + "°C");
				System.out.println("Operação finalizada.");
				System.exit(0);
			}
		}

	}

}
