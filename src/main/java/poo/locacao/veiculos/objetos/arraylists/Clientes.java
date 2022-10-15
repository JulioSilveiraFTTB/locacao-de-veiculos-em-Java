package poo.locacao.veiculos.objetos.arraylists;

import poo.locacao.veiculos.objetos.Cliente;
import poo.locacao.veiculos.objetos.interfaces.IClientes;

import java.util.ArrayList;
import java.util.List;

public class Clientes implements IClientes {
    // cria um array list para armazenar os clientes cadastrados
    private final List<Cliente> clientes = new ArrayList<>();

    public void add(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
        }
    }

    @Override
    public Cliente get(long CPF) {
        // TODO Auto-generated method stub
        return null;
    }

    // public Cliente get(long cpf){
    //     for (Cliente cliente : clientes) {
    //         if (cliente.getCpf() == cpf) {
    //             return cliente;
    //         } else if (cliente.getCpf() =!) {
    //             return null;
    //         }
    //         }
    //     }

    public String getInfo(long cpf){
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente.toString();
            }
        }
        return null;
    }

    public String getInfo(){
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                return cliente.toString();
            }
        }
        return null;
    }

    public String getResumoInfo(){
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                // criar nova String no Objeto Cliente para diferenciar Info normal de resumida
                return cliente.toString();
            }
        }
        return null;
    }

    public boolean remove(long cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                clientes.remove(cliente);
                return true;
            }
        }
        return false;
    }

    public boolean existe(long cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return true;
            }
        }
        return false;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
