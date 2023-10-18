import java.util.Scanner;
public class App {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        fourth();
    }

    public static void first() {
        int n = scanner.nextInt();
        int number, sum;
        for (int i = 0; i < n; i++) {
        	sum = 0;
        	number = scanner.nextInt();
        	for (int j = 1; j < number; j++) {
        		if (number % j == 0) sum += j;
        	}
        	if (sum == number) System.out.println(number + " eh perfeito");
        	else System.out.println(number + " nao eh perfeito");
        }
    }

    public static void second() {
        int n = scanner.nextInt();
        int number, cont;
        for (int i = 0; i < n; i++) {
        	cont = 0;
        	number = scanner.nextInt();
        	for (int j = 2; j < number; j++) {
        		if (number % j == 0) cont++;
        	}
        	if (cont == 0) System.out.println(number + " eh primo");
        	else System.out.println(number + " nao eh primo");
       }
    }

    public static void third() {
        int first = 0;
        int second = 1;

        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void fourth() {
        double nota1, nota2, flag = 1;
		while (flag == 1) {
			
			nota1 = scanner.nextDouble();
			while (nota1 > 10 || nota1 < 0) {
				System.out.println("nota invalida");
				nota1 = scanner.nextDouble();
			}
			
			nota2 = scanner.nextDouble();
			while (nota2 > 10 || nota2 < 0) {
				System.out.println("nota invalida");
				nota2 = scanner.nextDouble();
			}
			
			double media = (nota1 + nota2) / 2;
			System.out.println(String.format("media = %.2f", media));
			
			System.out.println("novo calculo (1-sim 2-nao)");
			flag = scanner.nextInt();
			while (flag != 1 && flag != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				flag = scanner.nextInt();
			}
		}
    }

    public static void last() {
        float sum = 0; int cont = 0;
        for(int i = 0; i < 6; i++) {
            float temp = scanner.nextFloat();
            if(temp > 0) {
                cont++;
                sum+= temp;
            }
            
        }
        float m = sum/cont;
        System.out.printf("%d valores positivos\n", cont);
        System.out.println(m);
    }
}
