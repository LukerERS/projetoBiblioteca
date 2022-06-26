package controllers.contracts;

import java.util.ArrayList;

import models.Livro;

public interface ILivroController {
    
    void cadastrar(Livro livro);
    ArrayList<Livro> listar();
    Livro buscarPorLivro(String titulo);
    void removerLivro(Livro Livro);
    void atualizarLivro(Livro livro);
    
}
