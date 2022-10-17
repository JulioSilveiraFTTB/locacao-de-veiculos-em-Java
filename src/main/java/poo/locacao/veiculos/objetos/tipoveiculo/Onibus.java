package poo.locacao.veiculos.objetos.tipoveiculo;

import poo.locacao.veiculos.objetos.Veiculo;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.*;

public class Onibus extends Veiculo {
    private final int nPassageiros;
    private final Categoria categoria;
    // usar enums para wifi e ar-condicionado?

    /**
     * Construtor do objeto Veiculo
     * 
     * @param placa
     * @param ano
     * @param diaria
     * @param nPassageiros
     * @param categoria
     */
    public Onibus(String placa, int ano, Double diaria, int nPassageiros, Categoria categoria){
        super(placa, ano, diaria);
        this.nPassageiros = nPassageiros;
        this.categoria = categoria;
    }

    /**
     * Retorna a quantidade de passageiros do ônibus
     * 
     * @param nPassageiros
     */
    public int getNPassageiros(){
        return nPassageiros;
    }

    /**
     * Retorna a categoria do ônibus
     * 
     * @param nPassageiros
     */
    public Categoria getCategoria(){
        return categoria;
    }

    /**
     * Retorna a String completa da locação
     * 
     * @return
     */
    @Override
    public String toString(){
        return super.toString()
              + "Número de passageiros: " + nPassageiros + "\n"
              + "Categoria: " + categoria + "\n"
              + "Wi-Fi: " + "\n"
              + "Ar-Condicionado: ";
    }
}
