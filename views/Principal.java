package views;
import utils.Console;

public class Principal {
    
    public static void main (String[] args) {
        int opc = 0;

    do {
        System.out.println(" ___________________________________");
        System.out.println("|                                   |");
        System.out.println("|              M E N U              |");
        System.out.println("|___________________________________|");
        System.out.println("|                                   |");
        System.out.println("|      1 - Cadastrar Usuário        |");
        System.out.println("|      2 - Listar Usuários          |");
        System.out.println("|      3 - Cadastrar Funcionários   |");
        System.out.println("|      4 - Listar Funcionários      |");
        System.out.println("|      5 - Cadastrar Livro          |");
        System.out.println("|      6 - Listar Livros            |");
        System.out.println("|      7 - Registar um aluguel      |");
        System.out.println("|      8 - Livros Alugados          |");
        System.out.println("|      9 - Devolver livro           |");
        System.out.println("|     10 - Remover livro            |");
        System.out.println("|     11 - Atualizar livro          |");
        System.out.println("|     12 - Cancelar Cadastro        |");
        System.out.println("|                                   |");
        System.out.println("|             0 - SAIR              |");
        System.out.println("|___________________________________|");
        opc = Console.readInt("\n Digite a opção desejada: ");

        switch(opc) {
            case 1:
                CadastrarUsuario cadastrarUsuario = new CadastrarUsuario();
                cadastrarUsuario.renderizar();
                break;

            case 2:
                ListarUsuarios listarUsuarios = new ListarUsuarios();
                listarUsuarios.renderizar();
                break;

            case 3:
                CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
                cadastrarFuncionario.renderizar();
                break;

            case 4:
               ListarFuncionarios listarFuncionarios = new ListarFuncionarios();
               listarFuncionarios.renderizar();
                break;

            case 5:
                CadastrarLivro cadastrarLivro = new CadastrarLivro();
                cadastrarLivro.renderizar();
                break;

            case 6: 
                ListarLivros listarLivros = new ListarLivros();
                listarLivros.renderizar();

                break;

            case 7:
                CadastrarEmprestimo cadastrarEmprestimo = new CadastrarEmprestimo();
                cadastrarEmprestimo.renderizar();
                break;

            case 8:
                ListarEmprestimo listarEmprestimo = new ListarEmprestimo();
                listarEmprestimo.renderizar();
                break;

            case 9:
                DevolverLivro devolverLivro = new DevolverLivro();
                devolverLivro.renderizar();
                break;

            case 10:
                RemoverLivro removerLivro = new RemoverLivro();
                removerLivro.renderizar();
                break;
                
            case 11:
                AtualizarLivro atualizarLivro = new AtualizarLivro();
                atualizarLivro.renderizar();
                break; 

            case 12:
                CancelarCadastro cancelarCadastro = new CancelarCadastro();
                cancelarCadastro.renderizar();
                break; 

            case 0:
                System.out.println("\n\n ---------- SAINDO ----------\n\n");
                break;

            default: System.out.println("\n ---------- OPÇÃO INVÁLIDA ----------");

        }



        }while (opc != 0);
    }
}
