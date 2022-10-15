package poo.locacao.veiculos.objetos.tipoveiculo;

import poo.locacao.veiculos.objetos.Veiculo;

import poo.locacao.veiculos.objetos.Veiculo;

public class Caminhao extends Veiculo {
    private final int eixos;
    private Double carga;

    public Caminhao(String placa, int ano, Double diaria, int eixos, Double carga){
        super(placa, ano, diaria);
        this.eixos = eixos;
        this.carga = carga;
    }

    public int getEixos(){
        return eixos;
    }

    public Double getCarga(){
        return carga;
    }

    public void setCarga(Double carga){
        this.carga = carga;
    }

    public String toString(){
        return super.toString() +
               "N�mero de eixos: " + eixos + "\n"
             + "Carga m�xima: %.2f TON%n" + carga;
    }
}
