package views;
import controllers.LivroController;
import models.Livro;
import utils.Console;

public class RemoverLivro {

    public void renderizar() {
        LivroController livroController = new LivroController();
        System.out.println("\n ---------- Remover Livro ----------\n");
        String titulo = Console.readString("Digite o titulo do livro: ");
        Livro livro = livroController.buscarPorLivro(titulo);
        if(livro != null){
            livroController.removerLivro(livro);
        System.out.println("\n ---------- Livro removido com suceso! ----------");
        } else {
            System.out.println("\n -------- Livro não encontrado! --------");
        }
    }
    
}
