package poo.locacao.veiculos.objetos.tipoveiculo;

import poo.locacao.veiculos.objetos.Veiculo;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.ArCondicionado;

public class Carro extends Veiculo {
    private final int nPassageiros;
    private final int portas;
    private final Double consumo;
    private final ArCondicionado arCondicionado;

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
    public Carro(String placa, int ano, Double diaria, int nPassageiros, int portas, Double consumo, ArCondicionado arCondicionado) {
        super(placa, ano, diaria);
        this.nPassageiros = nPassageiros;
        this.portas = portas;
        this.consumo = consumo;
        this.arCondicionado = arCondicionado;
    }

    // public Carro(String placa) {
    //     super(placa);
    // }

    /**
     * Retorna a quantidade de passageiros do carro
     * 
     * @param nPassageiros
     */
    public int getNPassageiros() {
        return nPassageiros;
    }

    /**
     * Retorna a quantidade de portas do carro
     * 
     * @param portas
     */
    public int getPortas() {
        return portas;
    }

    /**
     * Retorna o consumo realizado pelo carro
     * 
     * @param consumo
     */
    public Double getConsumo() {
        return consumo;
    }

    /**
     * Retorna se o carro tem ar-condicionado ou n�o
     * 
     * @param arCondicionado
     */
    public ArCondicionado getArCondicionado() {
        return arCondicionado;
    }

     /**
     * Retorna a String completa da loca��o
     * 
     * @return
     */
    @Override
    public String toString() {
        return super.toString() +
               "Numero de passageiros: " + nPassageiros + "\n"
             + "Numero de portas: " + portas + "\n"
             + "Consumo: " + consumo + "km/L" + "\n"
             + "Ar-condicionado: "  + getArCondicionado() + "\n";
    }
}
