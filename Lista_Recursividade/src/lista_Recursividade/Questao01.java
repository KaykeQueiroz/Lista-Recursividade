package lista_Recursividade;

public class Questao01 {

	public static int CalcularMDC(int a, int b) {	
		if(b == 0) {
			return a;
		}
		return CalcularMDC(b, a % b);
	}
	
	public static void main(String[] args) {
		
		int resultado = CalcularMDC(8, 16);
		
		System.out.println("Resultado do MCD: " + resultado);
	}

}
