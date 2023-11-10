package app05;

public class Blog {
    private List<Postagem> postagens;

    public Blog(){}
    public Blog(List<Postagem> postagens) {
        this.postagens = postagens;
    }

    public void adicionarPostagem(Postagem postagem) {
        postagens.add(postagem);
    }

    public void listarPostagensPublicadas(){}

}