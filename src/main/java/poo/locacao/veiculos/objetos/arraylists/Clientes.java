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

    public Cliente get(long cpf){
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente;
            }
        }
    }

    public String getInfo(long cpf){
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente.toString();
            }
        }
    }

    public String getInfo(long cpf){
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente.toString();
            }
        }
    }

    public boolean set(long cpf, Cliente clienteModificado) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clientes.remove(cliente);
                clientes.add(clienteModificado);
                return true;
            }
        }
        return false;
    }

    public boolean remove(long cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clientes.remove(cliente);
                return true;
            }
        }
        return false;
    }

    public boolean existe(long cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
