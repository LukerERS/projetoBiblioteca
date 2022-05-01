package controllers;
import java.util.ArrayList;
import models.Livro;

public class DisponibilidadeController {
    private static ArrayList <Livro> disponibilidade = new ArrayList<Livro>();

    public void cadastrarDisponibilidade(Livro indisponivel) {
        disponibilidade.add(indisponivel);
    }


    public Livro buscarPorLivro(String titulo) {
        for(Livro livroLista: disponibilidade) {
            if(livroLista.getTitulo().equals(titulo)) {
                return livroLista;
            }
        }
        return null;
    }

    public void removerLivro(Livro Livro){
        disponibilidade.remove(Livro);
        
    }
}
