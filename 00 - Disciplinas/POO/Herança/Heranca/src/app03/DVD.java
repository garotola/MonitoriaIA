package app03;

public class DVD extends Midia{
    private int faixas;

    public DVD() {
    }

    public DVD(int codigo, double preco, String nome, int faixas) {
        super(codigo, preco, nome);
        this.faixas = faixas;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }
}
