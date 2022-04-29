package views;
import controllers.UsuarioController;
import models.Usuario;
import utils.Console;


public class CadastrarUsuario {
    
    public void renderizar() {
        Usuario usuario = new Usuario();
        UsuarioController usuarioController = new UsuarioController();
        System.out.println("\n ---------- Cadastro de Usuários ----------\n");
        usuario.setNome(Console.readString("Digite o nome do usuário: "));
        usuario.setCpf(Console.readString("Digite o CPF do usuário: "));
        usuario.setTelefone(Console.readLong("Digite o telefone do usuário: "));
        usuarioController.cadastrar(usuario);
        System.out.println("\n ---------- Usuário cadastrado com sucesso! ----------");
    }
}
