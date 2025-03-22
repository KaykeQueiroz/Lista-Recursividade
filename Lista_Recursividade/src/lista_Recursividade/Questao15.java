package lista_Recursividade;

public class Questao15 {

	public static int CalcularMDC(int a, int b) {	
		if(b == 0) {
			return a;
		}
		return CalcularMDC(b, a % b);
	}


    public static int CalcularMMC(int a, int b) {
        return (a * b) / CalcularMDC(a, b);
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 15;

        int resultado = CalcularMMC(a, b);

        System.out.println("O MMC de " + a + " e " + b + " é: " + resultado);
    }

}
