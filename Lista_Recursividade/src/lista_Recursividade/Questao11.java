package lista_Recursividade;

public class Questao11 {

	 public static String inverterString(String palavra) {
		 
	        //se a string estiver vazia ou tiver apenas um caractere, retorna ela mesma
	        if (palavra.isEmpty()) {
	            return palavra;
	        }
	        
	        //pega o último caractere e chama a função com o restante da string
	        return inverterString(palavra.substring(1)) + palavra.charAt(0);
	    }

	    public static void main(String[] args) {
	        String palavra = "alana";

	        String resultado = inverterString(palavra);

	        System.out.println("String invertida: " + resultado);
	    }

}
