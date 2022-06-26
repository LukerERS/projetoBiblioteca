package controllers.contracts;

import models.Livro;

public interface IDisponibilidadeController {

    void cadastrarDisponibilidade(Livro indisponivel);
    Livro buscarPorLivro(String titulo);
    void removerLivro(Livro Livro);

}
