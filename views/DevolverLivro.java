package views;
import controllers.DisponibilidadeController;
import controllers.UsuarioController;
import models.Livro;
import utils.Console;

import models.Usuario;
import models.Emprestimo;

public class DevolverLivro {

    public void renderizar() {
        DisponibilidadeController disponibilidadeController = new DisponibilidadeController();
        UsuarioController usuarioController = new UsuarioController();
        Emprestimo emprestimo = new Emprestimo();

        System.out.println("\n ---------- Devolver Livro ----------\n");

        String titulo = Console.readString("Digite o titulo do livro: ");
        Livro livro = disponibilidadeController.buscarPorLivro(titulo);
        if(livro != null){
            livro.setStatus("Disponível");
            disponibilidadeController.removerLivro(livro);        

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
