package poo.locacao.veiculos.objetos.interfaces;

import poo.locacao.veiculos.objetos.Cliente;
import poo.locacao.veiculos.objetos.excecoes.ClienteNaoEncontrado;

/**
 * Interface que permite a manipula��o de um conjunto de clientes.
 * @author Aline
 */
public interface IClientes {
    /**
     * Adiciona um cliente na rela��o de clientes.
     * @param c Cliente a ser inserido.
     */
    public void add(Cliente c);
    
    /**
     * Captura o cliente com o CPF informado por par�metro.
     * @param CPF CPF do cliente a ser capturado.
     * @return Cliente com o CPF informado ou null caso o CPF n�o for encontrado.
     */
    public Cliente get(long CPF) throws ClienteNaoEncontrado;
    
    /**
     * Captura uma String com as informa�oes do cliente com CPF informado por par�metro.
     * @param CPF CPF do cliente a ser capturado.
     * @return String com as informa�oes do cliente com o CPF informado por par�metro 
     * ou null caso o CPF n�o for encontrado.
     */
    public String getInfo(long CPF) throws ClienteNaoEncontrado;
    
    /**
     * Captura uma String com as informa�oes de todos os clientes.
     * @return String com as informa�oes de todos os clientes
     * ou null caso n�o exista nenhum cliente.
     */
    public String getInfo();
    
    /**
     * Captura uma String com o CPF e o nome de todos os clientes.
     * @return String com o CPF e o nome de todos os clientes
     * ou null caso n�o exista nenhum cliente.
     */
    public String getResumoInfo();
    
    /**
     * Remove o cliente com o CPF igual ao informado por par�metro.
     * @param CPF CPF do cliente a ser capturado.
     * @return True se o cliente com o CPF informado por par�metro for removido ou
     * false caso n�o exista nenhum cliente com o CPF informado. 
     */
    public boolean remove(long CPF);
    
    /**
     * Verifica se existe um cliente com o CPF informado por par�metro.
     * @param CPF CPF do cliente a ser verificado.
     * @return True se um cliente com o CPF informado for encontrado ou 
     * false caso n�o exista nenhum cliente com o CPF informado.
     */
    public boolean existe(long CPF);

    public boolean set(long CPF, Cliente cliente);
}
