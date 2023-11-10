package app01;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantidade de empregados : ");
		int n = input.nextInt();
		Employee[] emps = new Employee[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do Empregado " + (i+1));
			System.out.print("Terceizado(s/n) : ");
			boolean out = (input.next().equals("s")) ? true : false;
			System.out.print("Nome : ");
			String name = input.next();
			System.out.print("Horas : ");
			int hours = input.nextInt();
			System.out.print("Valor por hora : ");
			double valuePerHour = input.nextDouble();
			
			if(!out) emps[i] = new Employee(name,hours, valuePerHour);
			else {
				System.out.print("Despesa Adicional : ");
				double add = input.nextDouble();
				emps[i] = new OutsourcedEmployee(name,hours, valuePerHour, add);
			}
		}
		
		System.out.println("Pagamentos : ");
		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].toString());			
		}

		input.close();
	}

}
