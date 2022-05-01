package views;
import utils.Console;
import controllers.UsuarioController;
import controllers.LivroController;
import controllers.FuncionarioController;
import controllers.EmprestimoController;
import models.Usuario;
import models.Emprestimo;
import models.Livro;
import models.Funcionario;

public class CadastrarEmprestimo {
    
    public void renderizar(){
        Emprestimo emprestimo = new Emprestimo();
        UsuarioController usuarioController = new UsuarioController();
        FuncionarioController funcionarioController = new FuncionarioController();
        LivroController livroController = new LivroController();
        EmprestimoController emprestimoController = new EmprestimoController();

        System.out.println("\n -------- Cadastro de um empréstimo --------");

        String cpfUsuario = Console.readString("Digite o CPF do Usuário: ");
        Usuario usuario = usuarioController.buscarPorCpf(cpfUsuario);
        if(usuario != null){
            emprestimo.setUsuario(usuario);

            String matriculafFuncionario = Console.readString("Digite a matrícula do funcionário: ");
            Funcionario funcionario = funcionarioController.buscarPorMatricula(matriculafFuncionario);
            if (funcionario != null) {
                emprestimo.setFuncionario(funcionario);
        

                String nomeLivro = Console.readString("Digite o nome do Livro: ");
                Livro livro = livroController.buscarPorLivro(nomeLivro);
                if(livro !=null) {
                    emprestimo.setLivro(livro);
                    emprestimoController.cadastrar(emprestimo);
                    System.out.println("\n --------Empréstimo realizado com sucesso! --------\n");
                    
                } else {
                    System.out.println("Livro não encontrado! ");
                }
            } else {
                System.out.println("Matrícula do funcionário não encontrada! ");
            }
        }else {
            System.out.println("Usuário não encontrado! ");
        }

    }
}
