package app04;

public class Veiculo {
    private String modelo;
    private double preco;

    public Veiculo(String name, double preco) {
        this.modelo = name;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void printDados() {
        System.out.printf("Veiculo - %s - R$ %f\n", modelo, preco);
    }
}
