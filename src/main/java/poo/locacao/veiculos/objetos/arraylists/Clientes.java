package poo.locacao.veiculos.objetos.arraylists;

import poo.locacao.veiculos.objetos.Cliente;
import poo.locacao.veiculos.objetos.interfaces.IClientes;

import java.util.ArrayList;
import java.util.List;

public class Clientes implements IClientes {
    /**
     * Instancia uma nova ArrayList de objetos Locacao
     */
    private List<Cliente> clientes = new ArrayList<>();

    /**
     * Adiciona um cliente a lista de clientes
     */
    @Override
    public void add(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
        }
    }

    /**
     * Retorna um cliente utilizando seu CPF como par�metro de busca
     * 
     * @param cpf
     * @return
     */
    @Override
    public Cliente get(long cpf){
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente;
            } 
        }
        return null;
    }

    /**
     * Retorna a informa��es de um cliente utilizando seu CPF como par�metro de busca
     * 
     * @param cpf
     * @return
     */
    @Override
    public String getInfo(long cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente.toString();
            }
        }
        return null;
    }

    /**
     * Retorna as informa��es de todos os clientes dentro da ArrayList
     * 
     * @return
     */
    @Override
    public String getInfo() {
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                return cliente.toString();
            }
        }
        return null;
    }

    /**
     * Retorna as informa��es resumidas de todos os clientes dentro da ArrayList
     * 
     * @return
     */
    @Override
    public String getResumoInfo() {
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                // criar nova String no Objeto Cliente para diferenciar Info normal de resumida
                return cliente.toString();
            }
        }
        return null;
    }

    /**
     * Remove um cliente utilizando seu CPF como par�metro de busca
     * 
     * @param cpf
     * @return
     */
    @Override
    public boolean remove(long cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                clientes.remove(cliente);
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica a exist�ncia de um cliente utilizando seu CPF como par�metro
     * 
     * @param cpf
     * @return
     */
    @Override
    public boolean existe(long cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna todos os clientes inclu�dos dentro da ArrayList
     * 
     * @return
     */
    public List<Cliente> getClientes() {
        return clientes;
    }
}
