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
        System.out.println("|      8 - Alterar status de livro  |");
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
               ListarFuncionario listarFuncionario = new ListarFuncionario();
               listarFuncionario.renderizar();
                break;

            case 5:

                break;

            case 6: 

                break;

            case 7:

                break;

            case 0:
                System.out.println("\n\n ---------- SAINDO ----------\n\n");
                break;

            default: System.out.println("\n ---------- OPÇÃO INVÁLIDA ----------");

        }



        }while (opc != 0);
    }
}
