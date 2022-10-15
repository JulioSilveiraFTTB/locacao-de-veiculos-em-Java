package poo.locacao.veiculos.objetos.tipoveiculo;

import poo.locacao.veiculos.objetos.Veiculo;

public class Onibus extends Veiculo {
    private final int nPassageiros;
    // usar enums para wifi e ar-condicionado?

    public Onibus(String placa, int ano, Double diaria, int nPassageiros){
        super(placa, ano, diaria);
        this.nPassageiros = nPassageiros;
    }

    public int getNPassageiros(){
        return nPassageiros;
    }

    public String toString(){
        return super.toString()
              + "Número de passageiros: " + nPassageiros + "\n"
              + "Categoria: " + "\n"
              + "Wi-Fi: " + "\n"
              + "Ar-Condicionado: ";
    }
}
