package poo.locacao.veiculos.objetos.arraylists;

import poo.locacao.veiculos.objetos.Veiculo;
import poo.locacao.veiculos.objetos.interfaces.IVeiculos;

import java.util.ArrayList;
import java.util.List;

public class Veiculos implements IVeiculos {
    private static List<Veiculo> listaDeVeiculos = new ArrayList<>();

    public void add(Veiculo veiculo) {
        if(veiculo != null){
            listaDeVeiculos.add(veiculo);
        }
    }

    public Veiculo get(String placa) {
        for (Veiculo veiculo : listaDeVeiculos){
            if(veiculo.getPlaca().equals(placa)){
                return veiculo;
            }
        }
        return null;
    }

    public String getInfo(String placa) {
        for (Veiculo veiculo : listaDeVeiculos){
            if(veiculo.getPlaca().equals(placa)){
                return veiculo.toString();
            }
        }
        return null;
    }

    public String getInfo() {
        for (Veiculo veiculo : listaDeVeiculos){
            if(veiculo != null){
                return veiculo.toString();
            }
        }
        return null;
    }

    public String getResumoInfo() {
        for (Veiculo veiculo : listaDeVeiculos){
            if(veiculo != null){
                // substituir toString por algo reduzido
                return veiculo.toString();
            }
        }
        return null;
    }

    public boolean remove(String placa) {
        for (Veiculo veiculo : listaDeVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                listaDeVeiculos.remove(veiculo);
                return true;
            }
        }
        return false;
    }

    public boolean existe(String placa) {
        for (Veiculo veiculo : listaDeVeiculos) {
            if(veiculo.getPlaca().equals(placa)) {
                listaDeVeiculos.remove(veiculo);
                return true;
            }
        }
        return false;
    }
}

