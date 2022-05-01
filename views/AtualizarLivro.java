package views;
import controllers.LivroController;
import models.Livro;
import utils.Console;

public class AtualizarLivro {
  
    public void renderizar() {
        LivroController livroController = new LivroController();
        System.out.println("\n ---------- Atualizar Livro ----------\n");
        String titulo = Console.readString("Digite o titulo do livro que deseja atualizar: ");
        Livro livro = livroController.buscarPorLivro(titulo);
        if(livro != null){
            livroController.atualizarLivro(livro);
            livro.setTitulo(Console.readString("\n\nDigite o novo Título do livro: "));
            livro.setAutor(Console.readString("Digite o novo nome do autor: "));
            livro.setGenero(Console.readString("Digite o novo gênero do livro:"));
            System.out.println("\n ---------- Livro atualizado com sucesso! ----------");
        } else {
            System.out.println("\n -------- Livro não encontrado! --------");
        }
    }
    
}
