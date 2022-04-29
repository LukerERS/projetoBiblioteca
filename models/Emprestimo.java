package models;

public class Emprestimo{
    private Usuario usuario;
    private Livro livro;
    private Funcionario funcionario;

    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public Livro getLivro(){
        return livro;
    }
    public void setLivro(Livro livro){
        this.livro = livro;
    }

    public Funcionario getFuncionario(){
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        
        return 
            "Nome Usuario: " + usuario.getNome() +
            " | Titulo livro: " + livro.getTitulo() + 
            " | Funcionario Responsavel: " + funcionario.getNomeF();
    }
}