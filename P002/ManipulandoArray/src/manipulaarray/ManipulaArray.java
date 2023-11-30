package manipulaarray;

 import java.util.Random;
 import java.util.Scanner;

public class ManipulaArray {

		public static int[] gerandoArrayPeloUsuario() {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Informe o tamanho do array: ");
	        int tamanho = scanner.nextInt();

	        int[] arrayUser = new int[tamanho];

	        System.out.println("Informe os elementos do array:");
	        for (int i = 0; i < tamanho; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            arrayUser[i] = scanner.nextInt();
	        }

	        scanner.close();
	        return arrayUser;
	    }
		
	    public static int[] gerandoArrayAleatorio(int tamanho, int minValor, int maxValor) {
	        int[] arrayAleatorio = new int[tamanho];
	        Random random = new Random();

	        for (int i = 0; i < tamanho; i++) {
	            arrayAleatorio[i] = random.nextInt(maxValor - minValor + 1) + minValor;
	        }

	        return arrayAleatorio;
	    }
	    
	    public static int somaDosElementos(int [] array){
	    	int soma = 0;
	    	for (int i = 0; i < array.length; i++){
	    		
	    		soma += array[i];
	    	}
	    	
	    	return soma;
	   	
	    }
	    
	    public static int MaiorElemento(int [] array){
	    	int maior = 0;
	    	for (int i = 0; i < array.length; i++){
	    		
	    		if(array[i] > maior) {
	    			maior = array[i];
	    		}
	    	}
	  	
	    	return maior;
	    }
	    
	    public static int MenorElemento(int [] array){
	    	int menor = array[0];
	    	for (int i = 0; i < array.length; i++){
	    		
	    		if(array[i] < menor) {
	    			menor = array[i];
	    		}
	    	}	
	    	return menor;
	    }
	    
	    public static void main(String[] args) {
	        int[] arrayAleatorio = gerandoArrayAleatorio(3, 1, 10); 
	        int[] arrayUsuario = gerandoArrayPeloUsuario();
	       
	        for (int n : arrayAleatorio) {
	            System.out.print(n + " ");
	        }
	        
	        System.out.println();
	        
	        for (int n : arrayUsuario) {
	        	System.out.print(n + " ");
	        }
	        
	        int soma = somaDosElementos(arrayAleatorio);
	        int maior = MaiorElemento(arrayUsuario);
	        int menor = MenorElemento(arrayUsuario);

	        System.out.println("Soma dos elementos da array aleatória: " + soma);
	        System.out.println("Maior elemento da array criada pelo usuário: " + maior);
	        System.out.println("Menor elemento da array criada pelo usuário: " + menor);
	    }
}	

