package lista_Recursividade;

public class Questao07 {

	public class Palindromo {

		public static boolean Palindromo(String palavra, int inicio, int fim) {
			
			if (inicio >= fim) {
				return true;
			}

			char charInicio = Character.toLowerCase(palavra.charAt(inicio));
			char charFim = Character.toLowerCase(palavra.charAt(fim));

			if (!Character.isLetter(charInicio)) {
				return Palindromo(palavra, inicio + 1, fim);
			}
			if (!Character.isLetter(charFim)) {
				return Palindromo(palavra, inicio, fim - 1);
			}

			if (charInicio != charFim) {
				return false;
			}

			return Palindromo(palavra, inicio + 1, fim - 1);
		}

		public static void main(String[] args) {
			String palavra = "alana";

			boolean resultado = Palindromo(palavra, 0, palavra.length() - 1);

			if (resultado) {
				System.out.println("\"" + palavra + "\" é um palíndromo!");
			} else {
				System.out.println("\"" + palavra + "\" não é um palíndromo!");
			}
		}
	}

}
