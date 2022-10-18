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
     * Adiciona a loca��o a lista de loca��es
     */
    public void add(Locacao locacao) {
        if (locacao != null) {
            listaDeLocacoes.add(locacao);
        }
    }

    // duvida
    /**
     * Retorna uma loca��o usando o c�digo como par�metro
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
     * Apresenta as informa��es de uma loca��o atrav�s do seu c�digo
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
     * Apresenta as informa��es de todos as loca��es dentro da ArrayList
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
     * Remove uma loca��o ao utilizar o seu ID (c�digo) como par�metro 
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
     * Verifica a exist�ncia de uma loca��o usando o seu ID (c�digo) como par�metro
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
     * Retorna todas as loca��es inclu�das dentro da ArrayList
     * 
     * @return
     */
    public List<Locacao> getLocacoes() {
        return listaDeLocacoes;
    }
}
