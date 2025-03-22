package lista_Recursividade;

import java.util.Scanner;

public class Questao05 {

	public static void ImprimaNum(int n) {
        if (n <= 0) {
            return;
        }

        ImprimaNum(n - 1);
        System.out.print(n + " ");
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
        
        ImprimaNum(n);

	}

}
