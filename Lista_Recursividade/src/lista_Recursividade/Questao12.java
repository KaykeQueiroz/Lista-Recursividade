package lista_Recursividade;

public class Questao12 {

public static int somaArray(int[] num, int index) {
		
        //se o índice for igual ao tamanho do array, retorna 0 (não há mais elementos para somar)
        if (index == num.length) {
            return 0;
        }

        //soma o elemento atual com a soma dos elementos subsequentes
        return num[index] + somaArray(num, index + 1);
    }

    public static void main(String[] args) {
        
    	int[] num = {1, 2, 3, 4, 5};
        int resultado = somaArray(num, 0);

        System.out.println("A soma dos elementos do array é: " + resultado);
    }

}
