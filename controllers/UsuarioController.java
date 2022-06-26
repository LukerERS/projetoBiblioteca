package controllers;
import java.util.ArrayList;

import controllers.contracts.IUsuarioController;
import models.Usuario;

public class UsuarioController implements IUsuarioController {
    private static ArrayList <Usuario> usuarios = new ArrayList<Usuario>();

    @Override
    public boolean cadastrar(Usuario usuario) {
        if(buscarPorCpf(usuario.getCpf()) == null){
        usuarios.add(usuario);
        return true;
        }
        return false;
    }

    @Override
    public ArrayList <Usuario> listar() {
        return usuarios;
    }

    @Override
    public Usuario buscarPorCpf(String cpf) {
        for(Usuario usuarioLista: usuarios){
            if (usuarioLista.getCpf().equals(cpf)) {
                return usuarioLista;
            }
        }
        return null;
    }

    @Override
    public void removerUsuario(Usuario funcionario){
        usuarios.remove(funcionario);
        
    }
}
