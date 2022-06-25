package controllers;
import models.Funcionario;
import java.util.ArrayList;

public class FuncionarioController{
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public boolean cadastrar(Funcionario funcionario) {
        if(buscarPorCpf(funcionario.getCpf()) == null){
            funcionarios.add(funcionario);
            return true;
            }
            return false; 
    }

    public ArrayList<Funcionario> listar(){
        return funcionarios;
    }

    public Funcionario buscarPorCpf(String cpf) {
        for(Funcionario funcionarioLista: funcionarios){
            if (funcionarioLista.getCpf().equals(cpf)) {
                return funcionarioLista;
            }
        }
        return null;
    }

    public void removerFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
        
    }

    

}