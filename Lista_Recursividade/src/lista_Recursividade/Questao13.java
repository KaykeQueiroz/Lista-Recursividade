package lista_Recursividade;

public class Questao13 {

	public static int contarCaractere(String palavra, char c, int index) {
		
        //se o índice ultrapassar o tamanho da string, retorna 0
        if (index == palavra.length()) {
            return 0;
        }

        int conte = 0;

        // Verifica se o caractere atual é igual ao procurado
        if (palavra.charAt(index) == c) {
            conte = 1;
        }

        //chama a função para o próximo índice
        return conte + contarCaractere(palavra, c, index + 1);
    }

    public static void main(String[] args) {
        String palavra = "alana";
        char c = 'a';

        //chama a função com índice inicial 0
        int resultado = contarCaractere(palavra, c, 0);

        System.out.println("O caractere '" + c + "' aparece " + resultado + " vezes.");
    }
	

}
