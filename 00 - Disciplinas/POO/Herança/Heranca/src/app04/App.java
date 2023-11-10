package app04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Numeros de Veiculos : ");
        int n = input.nextInt();
        Veiculo[] veiculos = new Veiculo[n];

        for (int i = 0; i < veiculos.length; i++) {
            System.out.print("Moto[m] ou Carro[c]");
            boolean isMoto = (input.next().equals("m")) ? true : false;
            System.out.print("Modelo : ");
            String modelo = input.next();
            System.out.print("Preco : ");
            double preco = input.nextDouble();

            if(isMoto) {
                System.out.print("Ano :");
                int ano = input.nextInt();
                veiculos[i] = new Moto(modelo, preco, ano);
            }else {
                System.out.print("Km :");
                double km = input.nextDouble();
                veiculos[i] = new Carro(modelo, preco, km);
            }
        }

        double totalPreco = 0;
        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i].printDados();
            totalPreco+= veiculos[i].getPreco();
        }
        System.out.println("Total de Preço : " + totalPreco);
        totalPreco = 0;
        for (int i = 0; i < veiculos.length; i++) {
            if(veiculos[i] instanceof Carro) {
                if(((Carro)(veiculos[i])).getKm() > 100000) veiculos[i].setPreco(veiculos[i].getPreco()*0.92);
            }else {
                if(((Moto)(veiculos[i])).getAno() >= 2008) veiculos[i].setPreco(veiculos[i].getPreco()*1.10);
            }
            veiculos[i].printDados();
            totalPreco+= veiculos[i].getPreco();
        }
        System.out.println("Total de Preço : " + totalPreco);
    }
}