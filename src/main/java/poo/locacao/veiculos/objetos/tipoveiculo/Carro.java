package poo.locacao.veiculos.objetos.tipoveiculo;

import poo.locacao.veiculos.objetos.Veiculo;
public class Carro extends Veiculo {
    private final int nPassageiros;
    private final int portas;
    private final Double consumo;
    // usar enums para ar condicionado???

    /**
     * Construtor do objeto Veiculo
     * 
     * @param placa
     * @param ano
     * @param diaria
     * @param nPassageiros
     * @param portas
     * @param consumo
     */
    public Carro(String placa, int ano, Double diaria, int nPassageiros, int portas, Double consumo){
        super(placa, ano, diaria);
        this.nPassageiros = nPassageiros;
        this.portas = portas;
        this.consumo = consumo;
    }

    /**
     * Retorna a quantidade de passageiros do carro
     * 
     * @param nPassageiros
     */
    public int getNPassageiros(){
        return nPassageiros;
    }

    /**
     * Retorna a quantidade de portas do carro
     * 
     * @param portas
     */
    public int getPortas(){
        return portas;
    }

    /**
     * Retorna o consumo realizado pelo carro
     * 
     * @param consumo
     */
    public Double getConsumo(){
        return consumo;
    }

     /**
     * Retorna a String completa da locação
     * 
     * @return
     */
    @Override
    public String toString(){
        return super.toString() +
               "Número de passageiros: " + nPassageiros + "\n"
             + "Número de portas: " + portas + "\n"
             + "Consumo: %.2f km/L" + consumo + "\n"
             + "Ar-condicionado: "; // enum?
    }

    @Override
    public String informacoes() {
        // TODO Auto-generated method stub
        return null;
    }
}
