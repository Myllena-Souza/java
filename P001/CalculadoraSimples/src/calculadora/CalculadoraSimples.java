package calculadora;
import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;
		
		System.out.println("----- Calculadora Simples. -----");
		
		System.out.println("Digite o primeiro valor: ");
		double X = scanner.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		double Y = scanner.nextInt();
		
		System.out.println("[1] - ADIÇÃO" );
		System.out.println("[2] - SUBTRAÇÃO" );
		System.out.println("[3] - MULTIPLICAÇÃO" );
		System.out.println("[4] - DIVISÃO" );
		System.out.println("Digite qual operação quer realizar" );
		int operacao = scanner.nextInt();
		
		double resultado = 0; 
		
				switch (operacao) {
				
				case 1:
				resultado = X + Y;
				
				break;
				
				case 2:
					resultado = X - Y;
					
					break;
				
				case 3:
					resultado = X * Y;
					
					break;
				
				case 4:
					if (Y != 0) {
						resultado = X / Y;
					}
					else {
						System.out.println("A divisão por zero não é permitida.");
						System.exit(0);
					}
					break;
					
				case 0:
					System.out.println("Calculadora finalizada");
					System.exit(0);
				}
				
				if (resultado % 1 == 0) {
					System.out.println("O valor da operação selecionada é: " + (int) resultado);
				}
				else {
					System.out.println("O da operação selecionada é: ");
					System.out.println("Operação finalizada.");
				}
				scanner.close();
	}
}
