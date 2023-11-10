package app04;

public class Carro extends Veiculo{
    private double km;

    public Carro(String name, double preco, double km) {
        super(name, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

}
