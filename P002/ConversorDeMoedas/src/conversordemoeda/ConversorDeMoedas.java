package conversordemoeda;

import java.util.Scanner;

public class ConversorDeMoedas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("__________________________CONVERSOR DE MOEDAS_____________________________");
		
		System.out.println("Digite quantos dolare deseja converter (U$): ");
		double quantiDolar = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Insira para qual moeda você deseja converter os dólares: (Euro ou Reais?) ");
		String moeda = scanner.nextLine();
		
		System.out.println("Insira a taxa de câmbio que deseja: ");
		double taxa = scanner.nextDouble();
		scanner.nextLine();
		
		double conversao = quantiDolar * taxa;
		
		System.out.printf(" %.2f Dólares convertido em %s equivale há: %.2f. ", quantiDolar, moeda, conversao);
		System.out.println(" ");
		System.out.println("____________________________CONVERSOR FINALIZADO___________________________");
	}
}

