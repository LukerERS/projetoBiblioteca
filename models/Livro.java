package  models;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private String status=("Disponível");

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    @Override
    public String toString() {
        
        return 
            "Titulo: " + titulo +
            " | Autor: " + autor +
            " | Genero: " + genero +
            " | Disponibilidade: " + status + "\n";
    }
    public static Livro replaceAll(String titulo2, String autor2, String genero2) {
        return null;
    }
}
