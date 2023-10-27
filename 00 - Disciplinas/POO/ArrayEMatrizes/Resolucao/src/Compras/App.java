package Compras;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id, n, quantity;
        String desc;
        double price;

        System.out.print("Lista de Compras - Quantidade de Produtos : ");
        n = input.nextInt();
        Invoice[] list = new Invoice[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Produto [%d]\n", (i+1));
            System.out.print("Id : ");
            id = input.nextInt();
            input.nextLine();
            System.out.print("Descrição : ");
            desc = input.nextLine();
            System.out.print("Quantidade :");
            quantity = input.nextInt();
            System.out.print("Preço da Unidade :");
            price = input.nextDouble();
            list[i] = new Invoice(id, desc, quantity, price);
        }

        double total = 0;
        System.out.println("-----Lista de Compras-----");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].toString());
            total += list[i].getInvoiceAmount();
        }
        System.out.printf("Total : %18.2f", total);
    }
}
