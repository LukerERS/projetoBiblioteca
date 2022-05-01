package views;
import controllers.DisponibilidadeController;
import models.Livro;
import utils.Console;

public class DevolverLivro {

    public void renderizar() {
        DisponibilidadeController disponibilidadeController = new DisponibilidadeController();
        System.out.println("\n ---------- Devolver Livro ----------\n");
        String titulo = Console.readString("Digite o titulo do livro: ");
        Livro livro = disponibilidadeController.buscarPorLivro(titulo);
        if(livro != null){
            livro.setStatus("Disponível")
            disponibilidadeController.removerLivro(livro);
        System.out.println("\n ---------- Livro devolvido com suceso! ----------");
        }
    }
    
}
