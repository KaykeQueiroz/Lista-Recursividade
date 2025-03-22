package lista_Recursividade;

import java.util.Scanner;

public class Questao09 {

	public static int Potencia(int base, int expo){
        if(expo == 0){
            return 1;
        }else{
            return base * Potencia(base, expo - 1);
        }
     }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente: ");
        int expo = sc.nextInt();

        int result = Potencia(base, expo);

        System.out.println("Potencia de " + base + " de expoente " + expo + " = " + result);

	}

}
