package poo.locacao.veiculos.objetos.arraylists;

import poo.locacao.veiculos.objetos.Veiculo;
import poo.locacao.veiculos.objetos.interfaces.IVeiculos;

import java.util.ArrayList;
import java.util.List;

public class Veiculos implements IVeiculos {
    /**
     * Instancia uma nova ArrayList de objetos Veiculo
     */
    private List<Veiculo> listaDeVeiculos = new ArrayList<>();

    /**
     * Adiciona o veiculo a lista de veiculos
     */
    @Override
    public void add(Veiculo veiculo) {
        if(veiculo != null){
            listaDeVeiculos.add(veiculo);
        }
    }

    /**
     * Retorna um ve�culo usando a placa como par�metro
     * 
     * @param placa
     * @return
     */
    @Override
    public Veiculo get(String placa) {
        for (Veiculo veiculo : listaDeVeiculos){
            if(veiculo.getPlaca().equals(placa)){
                return veiculo;
            }
        }
        return null;
    }

    /**
     * Apresenta as informa��es de um veiculo
     *  
     * @param placa
     * @return
     */
    @Override
    public String getInfo(String placa) {
        for (Veiculo veiculo : listaDeVeiculos){
            if(veiculo.getPlaca().equals(placa)){
                return veiculo.toString();
            }
        }
        return null;
    }

    /**
     * Apresenta as informa��es de todos os ve�culos dentro da ArrayList
     * 
     * @return
     */
    @Override
    public String getInfo() {
        for (Veiculo veiculo : listaDeVeiculos){
            if(veiculo != null){
                return listaDeVeiculos.toString();
            }
        }
        return null;
    }

    /**
     * Apresenta as informa��es resumidas de todos os ve�culos
     * 
     * @return
     */
    @Override
    public String getResumoInfo() {
        for (Veiculo veiculo : listaDeVeiculos){
            if(veiculo != null){
                return listaDeVeiculos.toString();
            }
        }
        return null;
    }

    /**
     * Remove um veiculo da lista atrav�s da sua placa
     * 
     * @param placa
     * @return
     */
    @Override
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
     * Verifica a exist�ncia de um ve�culo usando a placa como par�metro
     * 
     * @param placa
     * @return
     */
    @Override
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

