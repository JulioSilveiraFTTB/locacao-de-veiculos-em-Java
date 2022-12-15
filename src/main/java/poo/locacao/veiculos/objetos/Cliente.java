package poo.locacao.veiculos.objetos;

import java.io.Serializable;

public class Cliente implements Serializable{
    private static final long serialVersionUID = 25486284L;
    private String nome;
    private String endereco;
    private long cpf;
    private long cnh;
    private long telefone;

    /**
     * Construtor do objeto Veiculo
     * 
     * @param nome
     * @param endereco
     * @param cpf
     * @param cnh
     * @param telefone
     */
    public Cliente(String nome, String endereco, long cpf, long cnh, long telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.cnh = cnh;
        this.telefone = telefone;
    }

    /**
     * Retorna o nome do cliente
     * 
     * @param nome
     */
    public String getNome(){
        return nome;
    }

    /**
     * Atribui o nome do cliente
     * 
     * @param nome
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Retorna o endere�o do cliente
     * 
     * @param endereco
     */
    public String getEndereco(){
        return endereco;
    }

    /**
     * Atribui o endere�o ao cliente
     * 
     * @param endereco
     */
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    /**
     * Retorna o CPF do cliente
     * 
     * @param cpf
     */
    public long getCpf(){
        return cpf;
    }

    /**
     * Atribui o CPF ao cliente
     * 
     * @param cpf
     */
    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    /**
     * Retorna a CNH do cliente
     * 
     * @param cnh
     */
    public long getCnh(){
        return cnh;
    }

    /**
     * Atribui o CNH ao cliente
     * 
     * @param cnh
     */
    public void setCnh(long cnh){
        this.cnh = cnh;
    }

    /**
     * Retorna o telefone do cliente
     * 
     * @param telefone
     */
    public long getTelefone(){
        return telefone;
    }

    /**
     * Atribui o telefone ao cliente
     * 
     * @param telefone
     */
    public void setTelefone(long telefone){
        this.telefone = telefone;
    }

    /**
     * Retorna a String completa do cliente
     * 
     * @return
     */
    public String toString(){
     return "Nome: " + nome + "\n"
             + "Endereco: " + endereco + "\n"
             + "CPF: " + cpf + "\n"
             + "CNH: " + cnh + "\n"
             + "Telefone: " + telefone + "\n";
    }

    public String toStringResumido(){
	    return "Nome: " + this.nome + "\n" 
        +      "CPF: " + this.cpf + "\n";
	}
}
