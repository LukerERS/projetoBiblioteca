package controllers;
import java.util.ArrayList;
import models.Emprestimo;

public class EmprestimoController {
    private static ArrayList<Emprestimo> emprestimos =new ArrayList<Emprestimo>();

    public void cadastrar(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }

    public ArrayList<Emprestimo> listar() {
        return emprestimos;
    }

}
