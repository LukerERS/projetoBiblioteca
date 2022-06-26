package controllers;
import models.Livro;
import java.util.ArrayList;

import controllers.contracts.ILivroController;

public class LivroController implements ILivroController {
    private String titulo;
    private String autor;
    private String genero;

    private static ArrayList <Livro> livros = new ArrayList<Livro>();

    @Override
    public void cadastrar(Livro livro) {
        livros.add(livro);
    }

    @Override
    public ArrayList<Livro> listar(){
        return livros;
    }

    @Override
    public Livro buscarPorLivro(String titulo) {
        for(Livro livroLista: livros) {
            if(livroLista.getTitulo().equals(titulo)) {
                return livroLista;
            }
        }
        return null;
    }
    
    @Override
    public void removerLivro(Livro Livro){
        livros.remove(Livro);
        
    }
    
    @Override
    public void atualizarLivro(Livro livro){
        livro = Livro.replaceAll(titulo, autor, genero);;
    }


}
