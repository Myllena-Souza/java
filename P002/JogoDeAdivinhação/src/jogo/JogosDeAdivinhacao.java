package jogo;

import java.util.Random;
import java.util.Scanner;

public class JogosDeAdivinhacao {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		int numAleatorio;
		int tentativa, tentativas = 0;
		
		Random random = new Random();	
		numAleatorio = random.nextInt(100);
		
		do {
			
			System.out.println("Tente adivinhar um número inteiro entre 1 a 100: ");
			System.out.println("Qual o seu primeiro palpite?");
			tentativa = scanner.nextInt();
			tentativas++;
				
				if (tentativa < numAleatorio)
				{
				 System.out.println("Muito baixo! Tente um número maior...");
				}
				else if (tentativa > numAleatorio)
				{
					System.out.println("Muito Alto! Tente um número menor...");
				}
				else
				{
					System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativa(as).");
				}
		
		} while (tentativa != numAleatorio);
		
        scanner.close(); 
		
	}
}
