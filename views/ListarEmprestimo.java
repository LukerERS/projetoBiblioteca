package views;
import controllers.EmprestimoController;
import models.Emprestimo;
import views.contracts.IViews;

public class ListarEmprestimo implements IViews{

    @Override
    public void renderizar(){
        EmprestimoController emprestimoController = new EmprestimoController();
        System.out.println("\n -------- Listagem de Empréstimos --------\n");
        for (Emprestimo emprestimoCadastrada : emprestimoController.listar() ) {
            System.out.println(emprestimoCadastrada);

        }
    }

}
