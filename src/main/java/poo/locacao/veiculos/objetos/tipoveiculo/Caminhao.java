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

    // public Caminhao(String placa) {
    //     super(placa);
    // }

    /**
     * Retorna a quantidade de eixos do caminh�o
     * 
     * @param eixos
     */
    public int getEixos(){
        return eixos;
    }

    /**
     * Retorna a carga m�xima do caminh�o
     * 
     * @param carga
     */
    public Double getCarga(){
        return carga;
    }

    /**
     * Atribui a carga m�xima que o caminh�o pode carregar
     * 
     * @param carga
     */
    public void setCarga(Double carga){
        this.carga = carga;
    }

     /**
     * Retorna a String completa da loca��o
     * 
     * @return
     */
    @Override
    public String toString(){
        return super.toString() +
               "N�mero de eixos: " + eixos + "\n"
             + "Carga m�xima: " + carga + " toneladas" + "\n";
    }
}
