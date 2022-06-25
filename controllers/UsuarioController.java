package controllers;
import java.util.ArrayList;
import models.Usuario;

public class UsuarioController {
    private static ArrayList <Usuario> usuarios = new ArrayList<Usuario>();

    public boolean cadastrar(Usuario usuario) {
        if(buscarPorCpf(usuario.getCpf()) == null){
        usuarios.add(usuario);
        return true;
        }
        return false;
    }

    public ArrayList <Usuario> listar() {
        return usuarios;
    }

    public Usuario buscarPorCpf(String cpf) {
        for(Usuario usuarioLista: usuarios){
            if (usuarioLista.getCpf().equals(cpf)) {
                return usuarioLista;
            }
        }
        return null;
    }

    public void removerUsuario(Usuario funcionario){
        usuarios.remove(funcionario);
        
    }
}
