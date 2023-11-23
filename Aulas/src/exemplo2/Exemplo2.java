package exemplo2;

//EXEMPLO MÉDIA PONDERADA

public class Exemplo2 {
	public static float mediaPonderada(float x, float y, float z, int A, int B, int C) {
		return ((x * A + y * B + z * C) / (A + B + C));
	}
	
	public static void main(String[] args) {
		float nota1 = 5.5f;
		float nota2 = 9.5f;
		float nota3 = 7.5f;
		int A = 3;
		int B = 5;
		int C = 2;
		
		float resultado = mediaPonderada(nota1, nota2, nota3, A, B, C);
		
		System.out.println("A média ponderada é:" + resultado);
	}

}
