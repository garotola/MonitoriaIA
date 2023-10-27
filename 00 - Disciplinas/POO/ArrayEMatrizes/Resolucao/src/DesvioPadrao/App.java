package DesvioPadrao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double[] vet = new double[10];
        double sum = 0.0, avg;
        Scanner input = new Scanner(System.in);
        
        // Somatório - Média
        for (int i = 0; i < vet.length; i++) {
            vet[i] = input.nextInt();
            sum += vet[i];
        }

        avg = sum / 10;

        //Calculo da Diferença sum (xi - m)²
        double sumOfTheDifferences = 0.0;
        for (int i = 0; i < vet.length; i++) {
            double temp = vet[i] - avg;
            sumOfTheDifferences += (temp * temp); //Math.pow(temp, 2)
        }


        System.out.println("Desvio Padrão do Array : " + Math.sqrt(sumOfTheDifferences/9));
    }
}
