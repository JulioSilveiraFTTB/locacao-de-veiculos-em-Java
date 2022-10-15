package poo.locacao.veiculos.objetos;

public class Cliente {
    private String nome;
    private String endereco;
    private long cpf;
    private long cnh;
    private long telefone;

    public Cliente(String nome, String endereco, long cpf, long cnh, long telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.cnh = cnh;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public long getCpf(){
        return cpf;
    }

    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    public long getCnh(){
        return cnh;
    }

    public void setCnh(long cnh){
        this.cnh = cnh;
    }

    public long getTelefone(){
        return telefone;
    }

    public void setTelefone(long telefone){
        this.telefone = telefone;
    }

    public String toString(){
        return "Informações do cliente:\n"
             + "Nome: " + nome + "\n"
             + "Endereço: " + endereco + "\n"
             + "CPF: " + cpf + "\n"
             + "CNH: " + cnh + "\n"
             + "Telefone: " + telefone;
    }
}
