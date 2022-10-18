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
     * Construtor do objeto Veiculo usando apenas a placa como parâmetro
     * 
     * @param placa
     */
    public Veiculo(String placa){
        this.placa = placa;
    }

    /**
     * Retorna a placa do veículo
     * 
     * @param placa
     */
    public String getPlaca(){
        return placa;
    }

    /**
     * Atribui a placa do veículo
     * 
     * @param placa
     */
    public void setPlaca(String placa){
        this.placa = placa;
    }

    /**
     * Retorna o ano do veículo
     * 
     * @param ano
     */
    public int getAno(){
        return ano;
    }

     /**
     * Atribui o ano de criação do veículo
     * 
     * @param ano
     */
    public void setAno(int ano){
        this.ano = ano;
    }

    /**
     * Retorna a diária do veículo
     * 
     * @param ano
     */
    public Double getDiaria(){
        return diaria;
    }

    /**
     * Atribui o valor da diária para alugar o veículo
     * 
     * @param diaria
     */
    public void setDiaria(Double diaria){
        this.diaria = diaria;
    }

    /**
     * Retorna a String completa do veículo
     * 
     * @return
     */
    @Override
    public String toString(){
        return "Informacoes do veiculo:\n"
             + "Placa: " + placa + "\n"
             + "Ano: " + ano + "\n"
             + "Diaria: " + getDiaria() + "\n";
    }
}
