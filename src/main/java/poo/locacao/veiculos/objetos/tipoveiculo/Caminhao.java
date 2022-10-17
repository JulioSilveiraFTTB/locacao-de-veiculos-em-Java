package poo.locacao.veiculos.objetos.tipoveiculo;

import poo.locacao.veiculos.objetos.Veiculo;

public class Caminhao extends Veiculo {
    private final int eixos;
    private Double carga;

    /**
     * Construtor do objeto Veiculo
     * 
     * @param placa
     * @param ano
     * @param diaria
     * @param eixos
     * @param carga
     */
    public Caminhao(String placa, int ano, Double diaria, int eixos, Double carga){
        super(placa, ano, diaria);
        this.eixos = eixos;
        this.carga = carga;
    }

    /**
     * Retorna a quantidade de eixos do caminhão
     * 
     * @param eixos
     */
    public int getEixos(){
        return eixos;
    }

    /**
     * Retorna a carga máxima do caminhão
     * 
     * @param carga
     */
    public Double getCarga(){
        return carga;
    }

    /**
     * Atribui a carga máxima que o caminhão pode carregar
     * 
     * @param carga
     */
    public void setCarga(Double carga){
        this.carga = carga;
    }

     /**
     * Retorna a String completa da locação
     * 
     * @return
     */
    @Override
    public String toString(){
        return super.toString() +
               "Número de eixos: " + eixos + "\n"
             + "Carga máxima: %.2f TON%n" + carga;
    }

    @Override
    public String informacoes() {
        // TODO Auto-generated method stub
        return null;
    }
}
