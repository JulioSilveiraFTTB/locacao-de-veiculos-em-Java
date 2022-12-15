/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.locacao.veiculos.files;

import poo.locacao.veiculos.objetos.arraylists.Clientes;
import poo.locacao.veiculos.objetos.arraylists.Locacoes;
import poo.locacao.veiculos.objetos.arraylists.Veiculos;

/**
 *
 * @author rodrigo
 */
public class GerenciaListas {
    /**
     *
     * @param c
     * @return 
     */
    public static Clientes lerListas(Clientes c) {
        		
        		try{
        			Object obj;
        			obj = Arquivo.ler("ListaClientes");
        			c = (Clientes) obj;
                                return c;
        		}catch(Exception er) {
        			System.err.println(er.getMessage());
        		}
                        return c;
        	}
    /**
     *
     * @param c
     */
    public static void gravarListas(Clientes c) {
		try {
			Arquivo.gravar(c, "ListaClientes");
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
	}
    /**
     *
     * @param v
     * @return 
     */
    public static Veiculos lerListas(Veiculos v) {
        		
        		try{
        			Object obj;
        			obj = Arquivo.ler("ListaVeiculos");
        			v = (Veiculos) obj;
                                return v;
        		}catch(Exception er) {
        			System.err.println(er.getMessage());
        		}
                        return v;
        	}
    /**
     *
     * @param v
     */
    public static void gravarListas(Veiculos v) {
		try {
			Arquivo.gravar(v, "ListaVeiculos");
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
	}
    /**
     *
     * @param l
     * @return 
     */
    public static Locacoes lerListas(Locacoes l) {
        		
        		try{
        			Object obj;
        			obj = Arquivo.ler("ListaLocacoes");
        			l = (Locacoes) obj;
                                return l;
        		}catch(Exception er) {
        			System.err.println(er.getMessage());
        		}
                        return l;
        	}

    /**
     *
     * @param l
     */
    public static void gravarListas(Locacoes l) {
		try {
			Arquivo.gravar(l, "ListaLocacoes");
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
	}
}
