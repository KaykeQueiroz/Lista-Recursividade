package lista_Recursividade;

import java.util.Scanner;

public class Questao04 {

	public static int SomaNum(int num) {
		
		if(num == 0) {
			return 0;
		}
		
		//pega o ultimo numero e realiza sua soma
		return num%10 + SomaNum(num/10);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um conjunto de número: ");
		int num = sc.nextInt();
		
		int soma = SomaNum(num);
		
		System.out.println("Soma de " + num + " = " + soma);
	}

}
