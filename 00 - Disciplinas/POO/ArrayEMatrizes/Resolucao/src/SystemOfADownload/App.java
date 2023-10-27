package SystemOfADownload;

import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
           Scanner input = new Scanner(System.in);
           String[] musicas = {"PROXYCITY","P.Y.N.G.","DNSUEY!","SERVERS","HOST!","CRIPTONIZE","OFFLINE DAY","SALT","ANSWER!","RAR?","WIFI ANTENNAS"};
           int count = Integer.parseInt(input.nextLine());
           for (int i = 0; i < count; i++) {
                String[] entrada = input.nextLine().split(" ");
                int soma = Integer.parseInt(entrada[0]) + Integer.parseInt(entrada[1]);
                System.out.println(musicas[soma]);
            }
        }
}
