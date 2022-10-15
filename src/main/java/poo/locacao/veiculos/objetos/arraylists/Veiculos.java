package poo.locacao.veiculos.objetos.arraylists;

import poo.locacao.veiculos.objetos.Veiculo;
import poo.locacao.veiculos.objetos.interfaces.IVeiculos;

import java.util.ArrayList;
import java.util.List;

public class Veiculos implements IVeiculos {
    private static ArrayList<Veiculo> listaDeVeiculos = new ArrayList<>();

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
        Veiculo veiculo = get(placa);

        if(veiculo != null){
            return veiculo.toString();
        }
        return null;
    }

    public String getResumoInfo() {
        String dado = "";

        for(Veiculo veiculo : listaDeVeiculos){
            dado = veiculo.toString();
        }

        if(dado != ""){
            return dado;
        }
    }



}