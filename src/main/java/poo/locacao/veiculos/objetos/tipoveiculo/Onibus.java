package poo.locacao.veiculos.objetos.tipoveiculo;

import poo.locacao.veiculos.objetos.Veiculo;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.*;

public class Onibus extends Veiculo {
    private final int nPassageiros;
    private final Categoria categoria;
    // usar enums para wifi e ar-condicionado?

    public Onibus(String placa, int ano, Double diaria, int nPassageiros, Categoria categoria){
        super(placa, ano, diaria);
        this.nPassageiros = nPassageiros;
        this.categoria = categoria;
    }

    public int getNPassageiros(){
        return nPassageiros;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public String toString(){
        return super.toString()
              + "Número de passageiros: " + nPassageiros + "\n"
              + "Categoria: " + categoria + "\n"
              + "Wi-Fi: " + "\n"
              + "Ar-Condicionado: ";
    }

    @Override
    public String informacoes() {
        // TODO Auto-generated method stub
        return null;
    }
}
