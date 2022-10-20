package poo.locacao.veiculos.objetos;

public class Cliente2{
	private String nome;
	private long telefone;
	private Endereco endereco;
	private long CPF;
	private long numCarteira;
	//construtor de cliente
	public Cliente2(String nome, long CPF, long numCarteira) {
		this.nome = nome;
		this.CPF = CPF;
		this.numCarteira = numCarteira;
		telefone = 0;
		this.endereco = null;
	}
	public String getNome() {
		return nome;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	//retorna as informacoes do cliente
	public String toString() {
		return "Nome: "+ nome +" CPF: " +this.CPF+" Numero da certeira de motorista: "+ this.numCarteira+" Telefone: "+ telefone +"\n"+getEndereco();
	}
	public void setEndereco(long CEP,String pais,String cidade,String rua,int numero) {
		this.endereco = new Endereco( CEP, pais, cidade, rua, numero);
	}
	public String getEndereco() {
	    if(endereco != null)
		    return this.endereco.getEndereco();
		return "Sem endereco cadastrado.";
	}
	public void setCPF(long newCPF) {
		CPF = newCPF;
	}
	public long getCPF() {
		return CPF;
	}
	public boolean valida(long CPF) {
		if(CPF == this.CPF) {
			return true;
		}	
		return false;
	}
	public void setNumCarteira(long numCarteira) {
		this.numCarteira = numCarteira;
	}
	public long getNumCarteira() {
		return this.numCarteira;
	}
	public String getResumoInfo(){
	    return "Nome: "+ this.nome+" CPF: "+this.CPF;
	}
}