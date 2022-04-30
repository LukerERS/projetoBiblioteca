package controllers;
import java.util.ArrayList;
import models.Usuario;

public class UsuarioController {
    private static ArrayList <Usuario> usuarios = new ArrayList<Usuario>();

    public void cadastrar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public ArrayList <Usuario> listar() {
        return usuarios;
    }
}
