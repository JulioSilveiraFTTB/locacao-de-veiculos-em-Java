package poo.locacao.veiculos.objetos.interfaces;

import poo.locacao.veiculos.objetos.Veiculo;
import poo.locacao.veiculos.objetos.excecoes.VeiculoException;

/**
 * Interface que permite a manipula��o de um conjunto de ve�culos.
 * @author Aline
 */
public interface IVeiculos {

    /**
     * Adiciona um veiculo na rela��o de veiculos.
     * @param v Veiculo a ser inserido.
     */
    public void add(Veiculo v);
    
    /**
     * Captura o veiculo com a placa informada por par�metro.
     * @param placa Placa do veiculo a ser capturado.
     * @return Veiculo com a placa informada ou null em caso da placa n�o ser encontrada.
     */
    public Veiculo get(String placa) throws VeiculoException;
    
    /**
     * Captura uma String com as informa�oes do veiculo com a placa informada por par�metro.
     * @param placa Placa do veiculo a ser capturado.
     * @return String com as informa�oes do veiculo com a placa informada por par�metro 
     * ou null em caso da placa n�o ser encontrada.
     */
    public String getInfo(String placa) throws VeiculoException;
    
    /**
     * Captura uma String com as informa�oes de todos os veiculos.
     * @return String com as informa�oes de todos os veiculos 
     * ou null caso n�o exista nenhum veiculo.
     */
    public String getInfo();
    
    /**
     * Captura uma String com a placa, o ano e o valor da diaria de todos os veiculos.
     * @return String com a placa, o ano e o valor da diaria de todos os veiculos 
     * ou null caso n�o exista nenhum veiculo.
     * @throws Exception
     */
    public String getResumoInfo();
       
    /**
     * Remove o veiculo com placa igual a informada por par�metro.
     * @param placa Placa do veiculo a ser capturado.
     * @return True se o veiculo com a placa informada por par�metro for removido ou
     * false caso n�o exista nenhum veiculo com a placa informada. 
     */
    public boolean remove(String placa);
    
    /**
     * Verifica se existe um veiculo com a placa informada por par�metro.
     * @param placa Placa do veiculo a ser verificada.
     * @return True se um veiculo com a placa informada for encontrado ou 
     * false caso n�o exista nenhum veiculo com a placa informada.
     */
    public boolean existe(String placa);

    public boolean set(String placa, Veiculo veiculo);
}