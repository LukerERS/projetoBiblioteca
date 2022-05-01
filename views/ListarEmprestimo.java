package views;
import controllers.EmprestimoController;
import models.Emprestimo;

public class ListarEmprestimo {

    public void renderizar(){
        EmprestimoController emprestimoController = new EmprestimoController();
        System.out.println("\n -------- Listagem de Empréstimos --------\n");
        for (Emprestimo emprestimoCadastrada : emprestimoController.listar() ) {
            System.out.println(emprestimoCadastrada);

        }
    }

}
