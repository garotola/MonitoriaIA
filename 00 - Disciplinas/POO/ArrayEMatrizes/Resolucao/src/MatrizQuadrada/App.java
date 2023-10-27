package MatrizQuadrada;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        while(n != 0) {
            int columnMulti  = 1;
            int[][] m = new int[n][n];
            
            for (int i = 1; i <= m.length; i++) {
                int lineMulti = columnMulti;
                for (int j = 1; j <= m.length; j++) {
                    m[i-1][j-1] = lineMulti;
                    lineMulti *= 2;
                }
                columnMulti *= 2;
            }

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
            // 
            n = input.nextInt();
        }

    }
}
