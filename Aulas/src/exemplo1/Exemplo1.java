package exemplo1;

//EXEMPLO SOMA DE NUMEROS INTEIROS
public class Exemplo1 {
	
	public static int soma(int  A, int B){ // criando o metodo da classe que soma dois 
		return A + B; 
	}
	public static void main(String[] args) {
		
		int x = 3; // definindo uma variavel
		int y = 2;// definindo uma variavel
		int resultado = soma(x, y); // definindo uma segunda variavel que recebe o valor das duass variaveis
		
		System.out.println("O Resultado de " + x + " + " + y + " é: " + resultado);

		}

	
}
