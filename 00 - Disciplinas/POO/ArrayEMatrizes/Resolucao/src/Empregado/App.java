package Empregado;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salary;
        String firstName, lastName;


        System.out.print("Quantidade de Empregados : ");
        int n = input.nextInt();
        Employee[] arr = new Employee[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Empregado " + (i + 1));
            System.out.print("Nome : ");
            firstName = input.next();
            System.out.print("Sobrenome : ");
            lastName = input.next();
            System.out.print("Salário : ");
            salary = input.nextFloat();
            arr[i] = new Employee(firstName, lastName, salary);
        }

        System.out.println("[0] Lista de Empregados");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }

        System.out.println("[1] Aumento de 10% no Salário Mensal\n[2]Lista de Empregados");

        for (int i = 0; i < arr.length; i++) {
            arr[i].setMonthlySalary(arr[i].getMonthlySalary() * 0.1f + arr[i].getMonthlySalary());
            System.out.println(arr[i].toString());
        }

    }
}
