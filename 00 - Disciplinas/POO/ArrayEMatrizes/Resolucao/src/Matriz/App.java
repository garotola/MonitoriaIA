package Matriz;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual tamanho da matriz quadrada : ");
        int size = input.nextInt();
        int[][] m = new int[size][size];

        System.out.println("Preencha a matriz");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = input.nextInt();
            }
        }

        System.out.println("Quadrado Magico : " + QuadradoMagico.eQuadradoMagico(m));
    }
}
