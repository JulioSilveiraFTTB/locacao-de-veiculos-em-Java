package poo.locacao.veiculos.objetos.arraylists;

import poo.locacao.veiculos.objetos.Veiculo;
import poo.locacao.veiculos.objetos.interfaces.IVeiculos;

import java.util.ArrayList;
import java.util.List;
public class Veiculos implements IVeiculos {
    /**
     * Instancia uma nova ArrayList de objetos Veiculo
     */
    private final List<Veiculo> listaDeVeiculos = new ArrayList<>();

    /**
     * Adiciona o veiculo a lista de veiculos
     */
    public void add(Veiculo veiculo) {
        if(veiculo != null){
            listaDeVeiculos.add(veiculo);
        }
    }

    /**
     * Retorna um veículo usando a placa como parâmetro
     * 
     * @param placa
     * @return
     */
    public Veiculo get(String placa) {
        for (Veiculo veiculo : listaDeVeiculos){
            if(veiculo.getPlaca().equals(placa)){
                return veiculo;
            }
        }
        return null;
    }

    /**
     * Apresenta as informações de um veiculo
     *  
     * @param placa
     * @return
     */
    public String getInfo(String placa) {
        for (Veiculo veiculo : listaDeVeiculos){
            if(veiculo.getPlaca().equals(placa)){
                return veiculo.toString();
            }
        }
        return null;
    }

    /**
     * Apresenta as informações de todos os veículos dentro da ArrayList
     * 
     * @return
     */
    public String getInfo() {
        for (Veiculo veiculo : listaDeVeiculos){
            if(veiculo != null){
                return veiculo.toString();
            }
        }
        return null;
    }

    /**
     * Apresenta as informações resumidas de todos os veículos
     * 
     * @return
     */
    public String getResumoInfo() {
        for (Veiculo veiculo : listaDeVeiculos){
            if(veiculo != null){
                // substituir toString por algo reduzido
                return veiculo.toString();
            }
        }
        return null;
    }

    /**
     * Remove um veiculo da lista através da sua placa
     * 
     * @param placa
     * @return
     */
    public boolean remove(String placa) {
        for (Veiculo veiculo : listaDeVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                listaDeVeiculos.remove(veiculo);
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica a existência de um veículo usando a placa como parâmetro
     * 
     * @param placa
     * @return
     */
    public boolean existe(String placa) {
        for (Veiculo veiculo : listaDeVeiculos) {
            if(veiculo.getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    public List<Veiculo> getVeiculos() {
        return listaDeVeiculos;
    }
}

