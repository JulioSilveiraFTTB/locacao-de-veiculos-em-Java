package poo.locacao.veiculos;

import poo.locacao.veiculos.objetos.tipoveiculo.*;
import poo.locacao.veiculos.objetos.Veiculo;
import poo.locacao.veiculos.objetos.tipoveiculo.Carro;
import poo.locacao.veiculos.objetos.arraylists.*;

import java.util.List;
import java.util.ArrayList;

public class App 
{
    public static void main(String[] args) {
        System.out.println("Teste... ");

        List<Veiculo> listaDeVeiculos = new ArrayList<>();
        
        Veiculo carro = new Carro("ABC", 2010, 10.0, 4, 2, null);
        listaDeVeiculos.add(carro);

        Veiculo carro2 = new Carro("DEF", 2020, 20.0, 4, 4, null);
        listaDeVeiculos.add(carro2);
       
        System.out.println(listaDeVeiculos);
    }
}
