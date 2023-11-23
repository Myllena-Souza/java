package exercicioemaula;

public class ExemplosAula {
	public static void main(String[] args) {
		
	double x = 2;
	double y;
	do {
		y = x;
		x = x/2;
		
	}while (x > 0);
			System.out.println("O resultado é: " + y);
	}
}
