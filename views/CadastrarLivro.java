package views;
import controllers.LivroController;
import models.Livro;
import utils.Console;

public class CadastrarLivro {

    public void renderizar() {
        Livro livro = new Livro();
        LivroController livroController = new LivroController();
        System.out.println("\n ---------- Cadastro de Livros ----------\n");
        livro.setTitulo(Console.readString("Digite o Título do livro: "));
        livro.setAutor(Console.readString("Digite o nome do autor: "));
        livro.setGenero(Console.readString("Digite o gênero do livro:"));
        livro.setStatus(Console.readString("Digite o status do livro \n ALUGADO || DISPONÍVEL: "));
        livroController.cadastrar(livro);
        System.out.println("\n ---------- Livro cadastrado com suceso! ----------");
    }
    
}
