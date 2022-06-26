package controllers;
import java.util.ArrayList;

import controllers.contracts.IDisponibilidadeController;
import models.Livro;

public class DisponibilidadeController implements IDisponibilidadeController {
    private static ArrayList <Livro> disponibilidade = new ArrayList<Livro>();

    @Override
    public void cadastrarDisponibilidade(Livro indisponivel) {
        disponibilidade.add(indisponivel);
    }

    @Override
    public Livro buscarPorLivro(String titulo) {
        for(Livro livroLista: disponibilidade) {
            if(livroLista.getTitulo().equals(titulo)) {
                return livroLista;
            }
        }
        return null;
    }

    @Override
    public void removerLivro(Livro Livro){
        disponibilidade.remove(Livro);
        
    }
}
