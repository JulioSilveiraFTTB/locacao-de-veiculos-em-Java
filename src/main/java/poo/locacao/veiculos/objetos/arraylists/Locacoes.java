package poo.locacao.veiculos.objetos.arraylists;

import poo.locacao.veiculos.objetos.Locacao;
import poo.locacao.veiculos.objetos.interfaces.ILocacoes;

import java.util.ArrayList;
import java.util.List;

public class Locacoes implements ILocacoes {
    /**
     * Instancia uma nova ArrayList de objetos Locacao
     */
    private List<Locacao> listaDeLocacoes = new ArrayList<>();

    /**
     * Adiciona a locação a lista de locações
     */
    public void add(Locacao locacao) {
        if (locacao != null) {
            listaDeLocacoes.add(locacao);
        }
    }

    // duvida
    /**
     * Retorna uma locação usando o código como parâmetro
     * 
     * @param codigo
     * @return
     */
    public Locacao get(int codigo) {
        for (Locacao locacao : listaDeLocacoes) {
            if (locacao.getCodigo() == codigo) {
                return locacao;
            }
        }
        return null;
    }
    
    /**
     * Apresenta as informações de uma locação através do seu código
     * 
     * @return
     */
    public String getInfo(int codigo) {
        for (Locacao locacao : listaDeLocacoes) {
            if (locacao.getCodigo() == codigo) {
                return locacao.toString();
            }
        }
        return null;
    }

    /**
     * Apresenta as informações de todos as locações dentro da ArrayList
     * 
     * @return
     */
    public String getInfo() {
        for (Locacao locacao : listaDeLocacoes) {
            if (locacao != null) {
                return locacao.toString();
            }
        }
        return null;
    }

    // getResumoInfo()

    /**
     * Remove uma locação ao utilizar o seu ID (código) como parâmetro 
     * 
     * @param codigo
     * @return
     */
    public boolean remove(int codigo) {
        for (Locacao locacao : listaDeLocacoes) {
            if (locacao.getCodigo() == codigo) {
                listaDeLocacoes.remove(locacao);
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica a existência de uma locação usando o seu ID (código) como parâmetro
     * 
     * @param codigo
     * @return
     */
    public boolean existe(int codigo) {
        for (Locacao locacao : listaDeLocacoes) {
            if (locacao.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna todas as locações incluídas dentro da ArrayList
     * 
     * @return
     */
    public List<Locacao> getLocacoes() {
        return listaDeLocacoes;
    }
}
