package models;

public class ItemLivro {
    private Livro livro;
    private String titulo;
    
    public Livro getLivro(){
        return livro;
    }
    public void setLivro(Livro livro){
        this.livro=livro;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

}
