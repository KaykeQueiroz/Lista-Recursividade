package desafio;

public class TorreHanoi {

	public static void moverDiscos(int n, char origem, char destino, char auxiliar) {
        
		//disco 1 = menor
		//disco 2 = medio
		//disco 3 = grande
		
		//quando há um disco para mover, ele vai de origem para destino
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return;
        }
        
        //caso contrario ele precisará
        //passo 1: Mover n-1 discos de origem para auxiliar
        moverDiscos(n - 1, origem, auxiliar, destino);
        
        //passo 2: Mover o disco maior de origem para destino
        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        
        //passo 3: Mover n-1 discos de auxiliar para destino
        moverDiscos(n - 1, auxiliar, destino, origem);
    }

    public static void main(String[] args) {
        int n = 3; //qtd de disco
        char origem = 'A'; // Base A
        char destino = 'C'; // Base C
        char auxiliar = 'B'; // Base B
        
        moverDiscos(n, origem, destino, auxiliar);
    }

}
