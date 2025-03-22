package lista_Recursividade;

import java.util.Scanner;

public class Questao03 {

    public static String Conversao(int num) {
        if (num == 0) {
            return "";
        }
        return Conversao(num / 2) + (num % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("0");
        } else {
            System.out.println(num + " convertido em binário é " + Conversao(num));
        }

        sc.close();
    }
}
