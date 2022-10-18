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
    public void add(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
        }
    }

    /**
     * Retorna um cliente utilizando seu CPF como parâmetro de busca
     * 
     * @param cpf
     * @return
     */
    public Cliente get(long cpf){
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente;
            } 
        }
        return null;
    }

    /**
     * Retorna a informações de um cliente utilizando seu CPF como parâmetro de busca
     * 
     * @param cpf
     * @return
     */
    public String getInfo(long cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente.toString();
            }
        }
        return null;
    }

    /**
     * Retorna as informações de todos os clientes dentro da ArrayList
     * 
     * @return
     */
    public String getInfo() {
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                return cliente.toString();
            }
        }
        return null;
    }

    /**
     * Retorna as informações resumidas de todos os clientes dentro da ArrayList
     * 
     * @return
     */
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
     * Remove um cliente utilizando seu CPF como parâmetro de busca
     * 
     * @param cpf
     * @return
     */
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
     * Verifica a existência de um cliente utilizando seu CPF como parâmetro
     * 
     * @param cpf
     * @return
     */
    public boolean existe(long cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna todos os clientes incluídos dentro da ArrayList
     * 
     * @return
     */
    public List<Cliente> getClientes() {
        return clientes;
    }
}
