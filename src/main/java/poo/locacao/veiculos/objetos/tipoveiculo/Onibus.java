package poo.locacao.veiculos.objetos.tipoveiculo;

import poo.locacao.veiculos.objetos.Veiculo;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.*;

public class Onibus extends Veiculo {
    private final int nPassageiros;
    private final Categoria categoria;
    private final ArCondicionado arCondicionado;
    private final Wifi wifi;

    /**
     * Construtor do objeto Veiculo
     * 
     * @param placa
     * @param ano
     * @param diaria
     * @param nPassageiros
     * @param categoria
     */
    public Onibus(String placa, int ano, Double diaria, int nPassageiros, Categoria categoria, ArCondicionado arCondicionado, Wifi wifi) {
        super(placa, ano, diaria);
        this.nPassageiros = nPassageiros;
        this.categoria = categoria;
        this.arCondicionado = arCondicionado;
        this.wifi = wifi;
    }

    // public Onibus(String placa) {
    //     super(placa);
    // }

    /**
     * Retorna a quantidade de passageiros do �nibus
     * 
     * @param nPassageiros
     */
    public int getNPassageiros() {
        return nPassageiros;
    }

    /**
     * Retorna a categoria do �nibus
     * 
     * @param nPassageiros
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Retorna se o �nibus tem ar-condicionado ou n�o
     * 
     * @param arCondicionado
     */
    public ArCondicionado getArCondicionado() {
        return arCondicionado;
    }

    /**
     * Retorna se o �nibus tem Wifi ou n�o
     * 
     * @param wifi
     */
    public Wifi getWifi() {
        return wifi;
    }

    /**
     * Retorna a String completa da loca��o
     * 
     * @return
     */
    @Override
    public String toString() {
        return super.toString()
              + "N�mero de passageiros: " + nPassageiros + "\n"
              + "Categoria: " + categoria + "\n"
              + "Wi-Fi: " + getWifi() + "\n"
              + "Ar-Condicionado: " + getArCondicionado() + "\n";
    }
}
