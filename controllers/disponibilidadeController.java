package controllers;
import java.util.ArrayList;
import models.Livro;

public class disponibilidadeController {
    private static ArrayList <Livro> disponibilidade = new ArrayList<Livro>();

    public void cadastrar(Livro indisponivel) {
        disponibilidade.add(indisponivel);
    }

    public ArrayList<Livro> listar(){
        return disponibilidade;
    }

    public Livro buscarPorLivro(String titulo) {
        for(Livro livroLista: disponibilidade) {
            if(livroLista.getTitulo().equals(titulo)) {
                return livroLista;
            }
        }
        return null;
    }
}
