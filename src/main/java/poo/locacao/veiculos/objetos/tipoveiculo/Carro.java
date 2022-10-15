package poo.locacao.veiculos.objetos.tipoveiculo;

import poo.locacao.veiculos.objetos.Veiculo;
public class Carro extends Veiculo {
    private final int nPassageiros;
    private final int portas;
    private final Double consumo;
    // usar enums para ar condicionado???

    public Carro(String placa, int ano, Double diaria, int nPassageiros, int portas, Double consumo){
        super(placa, ano, diaria);
        this.nPassageiros = nPassageiros;
        this.portas = portas;
        this.consumo = consumo;
    }

    public int getNPassageiros(){
        return nPassageiros;
    }

    public int getPortas(){
        return portas;
    }

    public Double getConsumo(){
        return consumo;
    }

    public String toString(){
        return super.toString() +
               "Número de passageiros: " + nPassageiros + "\n"
             + "Número de portas: " + portas + "\n"
             + "Consumo: %.2f km/L" + consumo + "\n"
             + "Ar-condicionado: "; // enum?
    }
}
