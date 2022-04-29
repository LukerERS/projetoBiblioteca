package views;
import controllers.FuncionarioController;
import models.Funcionario;

public class ListarFuncionarios {
    
    public void renderizar() {
        FuncionarioController funcionarioController = new FuncionarioController();
        System.out.println("\n ---------- Listagem de Funcionários ----------\n");
        for (Funcionario funcionarioCadastrado : funcionarioController.listar()){
            System.out.println(funcionarioCadastrado);
        }
    }

}
