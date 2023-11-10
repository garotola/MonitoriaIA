package app04;

public class Moto extends Veiculo{

    private int ano;

    public Moto(String name, double preco, int ano) {
        super(name, preco);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
