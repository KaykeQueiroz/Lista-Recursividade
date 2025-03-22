package lista_Recursividade;

import java.util.Scanner;

public class Questao08 {

	public static int SomaNaturais(int num) {
		if (num == 0) {
            return 0;
        }

        return num + SomaNaturais(num - 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
        int n = sc.nextInt();
        
        int soma = SomaNaturais(n);
        
        System.out.println("Soma dos primeiros " + n + " números naturais é " + soma);

	}

}
