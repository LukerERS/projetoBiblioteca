package views;
import controllers.UsuarioController;
import models.Usuario;

public class ListarUsuarios {
    
    public void renderizar() {
        UsuarioController usuarioController = new UsuarioController();
        System.out.println("\n ---------- Listagem de Usuários ----------\n");
        for (Usuario usuarioCadastrado : usuarioController.listar()) {
            System.out.println(usuarioCadastrado);
        }
    }

}
