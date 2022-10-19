package poo.locacao.veiculos.menus;

import poo.locacao.veiculos.objetos.arraylists.*;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Color;
import poo.locacao.veiculos.Menu;
import poo.locacao.veiculos.objetos.Cor;

import java.util.Scanner;

public class MenuCliente {
    Clientes c = new Clientes();

    public static void areaCliente() {
       Scanner in = new Scanner(System.in);
       // menu com as opções dos métodos
       Cor.printf(Color.GREEN, "[CLIENTES - LOCADORA DE VEICULOS]\n\n");
       Cor.printf("    1 - Cadastrar novo cliente\n");
       Cor.printf("    2 - Consultar cliente (por CPF)\n");
       Cor.printf("    3 - Consultar cliente (por CPF/resumido)\n");
       Cor.printf("    4 - Consultar lista completa de clientes\n");
       Cor.printf("    5 - Remover cliente\n");
       Cor.printf("    6 - Retornar ao menu principal\n");
       Cor.printf("    0 - Sair\n");
       Cor.printf(Color.BLUE, "\nDigite uma das opcoes acima: ");
       int op = in.nextInt();

       switch (op) {
        case 1:
            cadastroCliente(null);
            break;
        case 2:
            consultaClientePorCpf(null);
            break;    
        case 3:
            consultaClienteResumidoPorCpf(null);
            break;
        case 4:
            consultaClientes(null);
            break;
        case 5:
            removeCliente(null);
            break;
        case 6:
            Menu.menuInicial();
            break;
        default:
            break;
        }
    }

    public static void cadastroCliente(Clientes c) {
        c.add(null);
    }

    public static void consultaClientePorCpf(Clientes c) {
        c.getInfo(0);   
    }

    public static void consultaClienteResumidoPorCpf(Clientes c) {
        c.getResumoInfo();  
    }

    public static void consultaClientes(Clientes c) {
        c.getInfo();  
    }

    // public static void editarCliente(Clientes c) {
        
    // }

    public static void removeCliente(Clientes c) {
        c.remove(0);
    }
}
