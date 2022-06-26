package views;
import controllers.DisponibilidadeController;
import controllers.UsuarioController;
import controllers.LivroController;
import models.Livro;
import utils.Console;
import views.contracts.IViews;
import models.Usuario;
import models.Emprestimo;

public class DevolverLivro implements IViews{

    @Override
    public void renderizar() {
        
        DisponibilidadeController disponibilidadeController = new DisponibilidadeController();
        LivroController livroController = new LivroController();
        UsuarioController usuarioController = new UsuarioController();
        Emprestimo emprestimo = new Emprestimo();
        
        System.out.println("\n ---------- Devolver Livro ----------\n");
        String titulo = Console.readString("Digite o titulo do livro: ");
        Livro livro2 = livroController.buscarPorLivro(titulo);
        
        if(livro2 != null){
            livro2.setStatus("Disponível");
            disponibilidadeController.removerLivro(livro2);        

            String cpfUsuario = Console.readString("Digite o CPF do Usuário: ");
            Usuario usuario = usuarioController.buscarPorCpf(cpfUsuario);
            if(usuario != null){
                emprestimo.setUsuario(usuario);
                System.out.println("\n ---------- Livro devolvido com suceso! ----------");
            } else {
                System.out.println(" -------- Usuário não encontrado --------");
            }
        
        }else {
            System.out.println(" -------- Livro não encontrado! --------");
        }
    }
    
}
