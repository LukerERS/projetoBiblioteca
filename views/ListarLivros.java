package views;
import controllers.LivroController;
import models.Livro;
import views.contracts.IViews;

public class ListarLivros implements IViews{

    @Override
    public void renderizar() {
        LivroController livroController = new LivroController();
        System.out.println("\n ---------- Listagem de Livros ----------\n");
        for (Livro livroCadastrado : livroController.listar()){
            System.out.println(livroCadastrado);
        }
    }
    
}
