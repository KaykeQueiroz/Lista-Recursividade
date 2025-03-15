package lista_Recursividade;

import java.util.Scanner;

public class Questao02 {

    public static int Fatorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        
        return x * Fatorial(x - 1);
    }
    
    public static void imprimirFatorial(int x) {
        int resultado = 1;
        System.out.print("Multiplicando: ");
        
        for (int i = 1; i <= x; i++) {
            resultado *= i;
            System.out.print(i); 
            if (i < x) {
                System.out.print(" * "); 
            }
        }
        System.out.println(" = " + resultado); 
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        imprimirFatorial(num);

        int result = Fatorial(num);
        System.out.println("Fatorial de " + num + " = " + result);
        
        sc.close();
    }
}
