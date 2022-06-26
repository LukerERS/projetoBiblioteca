package views;
import controllers.UsuarioController;
import models.Usuario;
import views.contracts.IViews;

public class ListarUsuarios implements IViews{
    
    @Override
    public void renderizar() {
        UsuarioController usuarioController = new UsuarioController();
        System.out.println("\n ---------- Listagem de Usuários ----------\n");
        for (Usuario usuarioCadastrado : usuarioController.listar()) {
            System.out.println(usuarioCadastrado);
        }
    }

}
