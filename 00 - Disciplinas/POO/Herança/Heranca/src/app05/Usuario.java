package app05;

public class Usuario {
    private int id;
    private String nome;
    private String login;
    private String nome;

    public Usuario(){}
    public Usuario(int id, String nome, String login, String nome1) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.nome = nome1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}