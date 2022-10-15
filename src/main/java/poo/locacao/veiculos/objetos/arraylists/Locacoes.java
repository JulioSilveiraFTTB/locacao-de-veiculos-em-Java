package poo.locacao.veiculos.objetos.arraylists;

import poo.locacao.veiculos.objetos.Locacao;
import poo.locacao.veiculos.objetos.interfaces.ILocacoes;

import java.util.ArrayList;
import java.util.List;

public class Locacoes implements ILocacoes {
    private final List<Locacao> locacoes = new ArrayList<>();

    public void add(Locacao locacao) {
        if (locacao != null) {
            locacoes.add(locacao);
        }
    }

    // duvida
    public Locacao get(int codigo) {
        for (Locacao locacao : locacoes) {
            if (locacao.getCodigo() == codigo) {
                return locacao;
            }
        }
        return null;
    }
    
    public String getInfo(int codigo) {
        for (Locacao locacao : locacoes) {
            if (locacao.getCodigo() == codigo) {
                return locacao.toString();
            }
        }
        return null;
    }

    public String getInfo() {
        for (Locacao locacao : locacoes) {
            if (locacao != null) {
                return locacao.toString();
            }
        }
        return null;
    }

    public boolean remove(int codigo) {
        for (Locacao locacao : locacoes) {
            if (locacao.getCodigo() == codigo) {
                locacoes.remove(locacao);
                return true;
            }
        }
        return false;
    }

    public boolean existe(int codigo) {
        for (Locacao locacao : locacoes) {
            if (locacao.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }
}
