package FibonnaciEmVetor;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {        
        int limit = 60;
        int[] fibVet = new int[limit];
        Scanner input = new Scanner(System.in);

        fibVet[0] = 0;
        fibVet[1] = 1;
        
        //Preenchimento do Vetor com Numeros de Fibo
        for (int i = 2; i < fibVet.length; i++) {
            fibVet[i] = fibVet[i-1] + fibVet[i-2];
        }

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int pos = input.nextInt();
            System.out.printf("Fib(%d) = %d\n", pos, fibVet[pos]);
        }
    }
}
