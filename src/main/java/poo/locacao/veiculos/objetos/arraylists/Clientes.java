package poo.locacao.veiculos.objetos.arraylists;

import poo.locacao.veiculos.objetos.Cliente;
import poo.locacao.veiculos.objetos.excecoes.ClienteNaoEncontrado;
import poo.locacao.veiculos.objetos.interfaces.IClientes;
import poo.locacao.veiculos.objetos.Cor;

import java.util.ArrayList;
import java.util.List;

public class Clientes implements IClientes {
    private static final String MENSAGEM = "Cliente não foi encontrado.";
    /**
     * Instancia uma nova ArrayList de objetos Locacao
     */
    private List<Cliente> c = new ArrayList<>();

    /**
     * Adiciona um cliente a lista de clientes
     */
    @Override
    public void add(Cliente cliente) {
        if (cliente != null) {
            c.add(cliente);
            Cor.printf(Cor.GREEN, "O cliente foi cadastrado com sucesso!");
        }
    }

    /**
     * Retorna um cliente utilizando seu CPF como par�metro de busca
     * 
     * @param cpf
     * @return
     */
    @Override
    public Cliente get(long cpf) throws ClienteNaoEncontrado{
        for (Cliente cliente : c) {
            if (cliente.getCpf() == cpf) {
                return cliente;
            } 
        }
        throw new ClienteNaoEncontrado(MENSAGEM);
    }

    /**
     * Retorna a informa��es de um cliente utilizando seu CPF como par�metro de busca
     * 
     * @param cpf
     * @return
     */
    @Override
    public String getInfo(long cpf) throws ClienteNaoEncontrado{
        for (Cliente cliente : c) {
            if (cliente.getCpf() == cpf) {
                return cliente.toString();
            }
        }
        throw new ClienteNaoEncontrado(MENSAGEM);
    }

    /**
     * Retorna as informa��es de todos os clientes dentro da ArrayList
     * 
     * @return
     */
    @Override
    public String getInfo() {
        for (Cliente cliente : c) {
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
        String dado = "";

        for (Cliente cliente : c) {
            if (cliente != null) {
                // criar nova String no Objeto Cliente para diferenciar Info normal de resumida
                dado+= cliente.toStringResumido() + "\n";
            }
        }
        return dado;
    }

    /**
     * Remove um cliente utilizando seu CPF como par�metro de busca
     * 
     * @param cpf
     * @return
     */
    @Override
    public boolean remove(long cpf) {
        for (Cliente cliente : c) {
            if (cliente.getCpf() == cpf) {
                c.remove(cliente);
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
        for (Cliente cliente : c) {
            if (cliente.getCpf() == cpf) {
                return true;
            }
        }
        return false;
    }

    /**
     * Remove um cliente usando seu CPF como parâmetro de pesquisa e insere um novo cliente, com novas informações
     * 
     * @param cpf
     * @return
     */
    @Override
    public boolean set(long cpf, Cliente clienteModificado) {
        for (Cliente cliente : c) {
            if (cliente.getCpf() == cpf) {
                c.remove(cliente);
                c.add(clienteModificado);
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
        return c;
    }
}
