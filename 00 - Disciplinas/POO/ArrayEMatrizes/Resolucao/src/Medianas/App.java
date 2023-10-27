package Medianas;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tamanho do 1º Vetor : ");
        float[] vet1 = new float[input.nextInt()];
        System.out.print("Tamanho do 2º Vetor : ");
        float[] vet2 = new float[input.nextInt()];
        float[] vet3 = new float[vet1.length + vet2.length];

        int vetPosition = 0;

        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = input.nextFloat();
            vet3[vetPosition] = vet1[i];
            vetPosition++;
        }
        
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] = input.nextFloat();
            vet3[vetPosition] = vet2[i];
            vetPosition++;
        }

        Arrays.sort(vet3); // Pode ser substituido por Bubble Sort
        System.out.print("Array : ");
        for (int i = 0; i < vet3.length; i++) {
            System.out.print(vet3[i] + " ");
        }

        float mediana = (vet3.length % 2 != 0) 
                        ? vet3[(vet3.length - 1)/2]
                        : (vet3[vet3.length/2] +  vet3[vet3.length/2 - 1])/2;

        System.out.println("Mediana : " + mediana) ;
    }
}
