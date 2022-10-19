package poo.locacao.veiculos;

import poo.locacao.veiculos.objetos.Cliente;
import poo.locacao.veiculos.objetos.Veiculo;
import poo.locacao.veiculos.objetos.tipoveiculo.Carro;
import poo.locacao.veiculos.objetos.tipoveiculo.Onibus;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.ArCondicionado;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Categoria;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Wifi;

import poo.locacao.veiculos.objetos.arraylists.*;

import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Teste... \n" );

        Veiculos v = new Veiculos();

        // List<Veiculo> listaDeVeiculos = new ArrayList<>();
        // List<Cliente> listaDeClientes = new ArrayList<>();
        
        Veiculo carro = new Carro("ABC", 2010, 10.0, 4, 2, 10.0, ArCondicionado.SIM);
        v.add(carro);
        System.out.println(v.getVeiculos());
        v.remove("ABC");

        // Veiculo carro2 = new Carro("DEF", 2020, 20.0, 4, 4, 15.0, ArCondicionado.NAO);
        // listaDeVeiculos.add(carro2);
        // Veiculo onibus = new Onibus("GHI", 2005, 500.0, 25, Categoria.CONVECIONAL, ArCondicionado.NAO, Wifi.NAO);
        // listaDeVeiculos.add(onibus);

        // // System.out.println(listaDeVeiculos + "\n");

        // Cliente cliente = new Cliente("Julio", "Rua Sete", 100055500, 1012202201, 99999999);
        // listaDeClientes.add(cliente);
        // Cliente cliente2 = new Cliente("Guilherme", "Rua Dois", 100042000, 1012202202, 99999998);
        // listaDeClientes.add(cliente2);
        // Cliente cliente3 = new Cliente("Alguem", "Rua Dez", 100030000, 1012202203, 99999997);
        // listaDeClientes.add(cliente3);

        // System.out.println(listaDeClientes);

        // carro.setPlaca("LOL");
        // carro.setAno(2022);
        // carro.setDiaria(50.0);
        // listaDeVeiculos.remove(carro2);
        // listaDeVeiculos.remove(onibus);
        // System.out.println(listaDeVeiculos + "\n");
        System.out.println(v.getVeiculos());
    }
}
