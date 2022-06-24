package views;
import controllers.UsuarioController;
import models.Usuario;
import utils.Console;
import utils.ValidaCPF;


public class CadastrarUsuario {
    
    public void renderizar() {
        Usuario usuario = new Usuario();
        UsuarioController usuarioController = new UsuarioController();
        System.out.println("\n ---------- Cadastro de Usuários ----------\n");
        usuario.setNome(Console.readString("Digite o nome do usuário: "));
        usuario.setCpf(Console.readString("Digite o CPF do usuário: "));
        usuario.setTelefone(Console.readLong("Digite o telefone do usuário: "));
        if (ValidaCPF.isCPF(usuario.getCpf()))
        if (usuarioController.cadastrar(usuario)) {
            System.out.println("\n---------- Usuário cadastrado com sucesso! ----------\n");
        } else {
            System.out.println("\n---------- CPF já cadastrado! ----------\n");
        }
        else System.out.printf("\n ---------- CPF Inválido! ----------\n");
    }
}
