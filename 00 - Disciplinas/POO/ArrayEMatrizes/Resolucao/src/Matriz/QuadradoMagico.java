package Matriz;

public class QuadradoMagico {
    public static boolean eQuadradoMagico(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            int temp = 0;
            for (int j = 0; j < m.length; j++) {
                temp += m[i][j];
            }

            if(temp != sum && i != 0) return false;
            sum = temp;
        }
    return true;
    }
}
