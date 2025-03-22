package lista_Recursividade;

import java.util.Scanner;

public class Questao06 {

	public static void ContagemRegressiva(int n) {
       
		if (n == 0) {
            System.out.println("Fim!");
            return;
        }
		
		System.out.print(n + " ");
		ContagemRegressiva(n - 1);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
        
        ContagemRegressiva(n);

	}

}
