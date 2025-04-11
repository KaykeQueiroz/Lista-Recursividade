public class App {

	public static int Par(int numero) {
        if(numero == 0){
            return 0;
        }

        int digito = numero % 10;
        int resto = numero / 10;

        if((digito % 2) == 0){
            return 1 + Par(resto);
        }else{
            return Par(resto);
        }
    }

    public static void main(String[] args) {
        int numero = 2456;
        int resultado = Par(numero);

        System.out.println("\n\n\n"+resultado);
        
    }

}