package VetorSemZeros;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vet = new int[15];
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = input.nextInt();
        }

        int copyPosition = 0;
        for (int readingPostion = 0; readingPostion < vet.length; readingPostion++) {
            if(vet[readingPostion] == 0) continue;
            
            vet[copyPosition] = vet[readingPostion];
            copyPosition++;
        }

        System.out.print("Vetor Final : ");
        for (int i = 0; i < copyPosition; i++) {
            System.out.print(vet[i]);
        }

    }
}
