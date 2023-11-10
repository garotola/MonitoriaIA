package app05;

public class Postagem {
    private int id;
    private String titulo;
    private String texto;
    private Date dataDePublicacao;
    public Postagem(int id, String titulo, String texto, Date dataDePublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.dataDePublicacao = dataDePublicacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDataDePublicacao() {
        return dataDePublicacao;
    }

    public void setDataDePublicacao(Date dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }
}