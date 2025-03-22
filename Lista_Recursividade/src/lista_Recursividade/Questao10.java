package lista_Recursividade;

public class Questao10 {
	
	public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void printFibo(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + "-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10;
        printFibo(n);
    }

}
