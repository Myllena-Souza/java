package exemplo4;

import java.util.Scanner;

//VERIFICAÇÃO DE PARIDADE

public class Exemplo4 {
	public static boolean paridade(int Z){ //função
		if (Z %2==0){
			return true;
		}
		return false;
	}
	
		
	public static void main(String[] args) {
		System.out.println("Digite um número inteiro: ");
		Scanner scanner = new Scanner (System.in); // class(de gerenciamento de teclado) estancia = construtor 
		int num = scanner.nextInt(); // pegando o valor do usuario em num
		
		if (paridade(num)) {
			System.out.println("O número digitado é par. ");
		}
		else {
			System.out.println("O número digitado é ímpar. ");
				
		}
	}	
}



