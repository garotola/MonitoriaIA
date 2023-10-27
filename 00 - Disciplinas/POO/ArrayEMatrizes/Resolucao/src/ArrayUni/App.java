package ArrayUni;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[][] m = new int[3][3];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }

        int[] arr = new int[3];
        int arrPosition = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                temp += m[j][i];
            }
            arr[arrPosition] = temp;
            arrPosition++;
        }
        Arrays.stream(arr).forEach(System.out::print);

    }
}
