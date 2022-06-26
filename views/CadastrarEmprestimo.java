package views;
import utils.Console;
import views.contracts.IViews;
import controllers.UsuarioController;
import controllers.DisponibilidadeController;
import controllers.LivroController;
import controllers.FuncionarioController;
import controllers.EmprestimoController;
import models.Usuario;
import models.Emprestimo;
import models.Livro;
import models.Funcionario;
import models.ItemLivro;

public class CadastrarEmprestimo implements IViews{
    
    @Override
    public void renderizar(){
        Emprestimo emprestimo = new Emprestimo();
        ItemLivro item = new ItemLivro();
        UsuarioController usuarioController = new UsuarioController();
        FuncionarioController funcionarioController = new FuncionarioController();
        LivroController livroController = new LivroController();
        EmprestimoController emprestimoController = new EmprestimoController();
        DisponibilidadeController disponibilidadeController = new DisponibilidadeController();

        System.out.println("\n -------- Cadastro de um empréstimo --------");

        String cpfUsuario = Console.readString("Digite o CPF do Usuário: ");
        Usuario usuario = usuarioController.buscarPorCpf(cpfUsuario);
        if(usuario != null){
            emprestimo.setUsuario(usuario);
            String matriculafFuncionario = Console.readString("Digite o CPF do funcionário: ");
            Funcionario funcionario = funcionarioController.buscarPorCpf(matriculafFuncionario);
            if (funcionario != null) {
                emprestimo.setFuncionario(funcionario);

                do {
                    item = new ItemLivro();
                    String nomeLivro = Console.readString("Digite o nome do Livro: ");
                    Livro livro = livroController.buscarPorLivro(nomeLivro);
                    
                        // emprestimoController.cadastrar(emprestimo);
                        // emprestimo.getLivros().add(item);
                            if(livro !=null){
                                if (livro.getStatus()=="Alugado"){
                                    System.out.println("Livro Indisponível!");
                                    } else {
                                            emprestimo.getLivros().add(item);
                                            item.setLivro(livro);
                                            livro.setStatus("Alugado"); 
                                        }
                                
                        } else {    
                        System.out.println("Livro não existe!");
                        }
                        
                  
                }while (Console.readString("Deseja alugar mais um livro? (S - Sim || N - Não)\n").toUpperCase().equals("S"));
                emprestimoController.cadastrar(emprestimo);

            } else {
                System.out.println("Matrícula do funcionário não encontrada! ");
            }

        }else {
            System.out.println("Usuário não encontrado! ");
        }
    }
}
