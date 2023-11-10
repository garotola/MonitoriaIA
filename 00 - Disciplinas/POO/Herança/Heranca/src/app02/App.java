package app02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Número de Produtos : ");
		int n = input.nextInt();
		SimpleDateFormat spd = new SimpleDateFormat("dd/MM/yyyy");
		Product[] p = new Product[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Produto " + (i+1));
			System.out.print("Comum, usado ou importado(c,u,i) : ");
			String type = input.next();
			System.out.print("Nome : ");
			String name = input.next();
			System.out.print("Price : ");
			double price = input.nextDouble();
			
			if(type.equals("c")) p[i] = new Product(name, price);
			else if(type.equals("u")) {
				System.out.print("Data(dd/MM/yyyy) : ");
				Date date = spd.parse(input.next());
				p[i] = new UsedProduct(name, price, date);
			}
			else if(type.equals("i")) {
				System.out.print("Customs fee : ");
				double c = input.nextDouble();
				p[i] = new ImportedProduct(name, price, c);
			}
		}
		
		System.out.println("Preços");
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].priceTag());
		}
		input.close();
	}

}
