package  models;

public class Usuario {
    
    private String nome;
    private String cpf;
    private Long telefone;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
     public Long getTelefone(){
        return telefone;
    }
    
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        
        return 
            "Nome: " + nome +
            " | CPF: " + cpf + 
            " | Telefone: " + telefone + "\n";
    }

}
