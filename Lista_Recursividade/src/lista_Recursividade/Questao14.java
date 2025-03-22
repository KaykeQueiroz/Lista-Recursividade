package lista_Recursividade;

public class Questao14 {

	public static int maiorElemento(int[] caract, int index) {
		
        //se o índice for o último, retorna o valor nesse índice
        if (index == caract.length - 1) {
            return caract[index];
        }

        //encontra o maior entre o atual e o próximo elemento
        int maiorRestante = maiorElemento(caract, index + 1);
        
        return Math.max(caract[index], maiorRestante);
    }

    public static void main(String[] args) {
        int[] arr = {3, 15, 37, 552, 448, 6};

        //índice inicial 0
        int resultado = maiorElemento(arr, 0);

        System.out.println("O maior elemento do array é: " + resultado);

    }
}
