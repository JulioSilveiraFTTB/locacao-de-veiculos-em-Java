package poo.locacao.veiculos.objetos;

public abstract class Veiculo {
    protected String placa;
    protected int ano;
    protected Double diaria;

    /**
     * Construtor do objeto Veiculo
     * 
     * @param placa
     * @param ano
     * @param diaria
     */
    public Veiculo(String placa, int ano, Double diaria){
        this.placa = placa;
        this.ano = ano;
        this.diaria = diaria;
    }

    /**
     * Construtor do objeto Veiculo usando apenas a placa como par�metro
     * 
     * @param placa
     */
    public Veiculo(String placa){
        this.placa = placa;
    }

    /**
     * Retorna a placa do ve�culo
     * 
     * @param placa
     */
    public String getPlaca(){
        return placa;
    }

    /**
     * Atribui a placa do ve�culo
     * 
     * @param placa
     */
    public void setPlaca(String placa){
        this.placa = placa;
    }

    /**
     * Retorna o ano do ve�culo
     * 
     * @param ano
     */
    public int getAno(){
        return ano;
    }

     /**
     * Atribui o ano de cria��o do ve�culo
     * 
     * @param ano
     */
    public void setAno(int ano){
        this.ano = ano;
    }

    /**
     * Retorna a di�ria do ve�culo
     * 
     * @param ano
     */
    public Double getDiaria(){
        return diaria;
    }

    /**
     * Atribui o valor da di�ria para alugar o ve�culo
     * 
     * @param diaria
     */
    public void setDiaria(Double diaria){
        this.diaria = diaria;
    }

    /**
     * Retorna a String completa do ve�culo
     * 
     * @return
     */
    @Override
    public String toString(){
        return "Placa: " + placa + "\n"
             + "Ano: " + ano + "\n"
             + "Diaria: " + getDiaria() + "\n";
    }

    public String toStringResumido(){
        return "Placa: " + placa + "\n"
             + "Ano: " + ano + "\n";
    }
}
