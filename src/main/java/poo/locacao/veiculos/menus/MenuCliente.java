package poo.locacao.veiculos.menus;

import poo.locacao.veiculos.objetos.arraylists.*;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Color;
import poo.locacao.veiculos.Menu;
import poo.locacao.veiculos.objetos.Cor;

import java.util.Scanner;

public class MenuCliente {
    Clientes c = new Clientes();

    public static void areaCliente() {
       int op;
       boolean repeat;
       boolean defaultRepeat;
       // menu com as op��es dos m�todos
       Cor.printf(Color.GREEN, "[CLIENTES - LOCADORA DE VEICULOS]\n\n");
       Cor.printf("    1 - Cadastrar novo cliente\n");
       Cor.printf("    2 - Consultar cliente (por CPF)\n");
       Cor.printf("    3 - Consultar cliente (por CPF/resumido)\n");
       Cor.printf("    4 - Consultar lista completa de clientes\n");
       Cor.printf("    5 - Remover cliente\n");
       Cor.printf("    6 - Retornar ao menu principal\n");
       Cor.printf("    0 - Sair\n");
       Cor.printf(Color.BLUE, "\nDigite uma das opcoes acima: ");
   
       try (Scanner in = new Scanner(System.in)) {
        do {
            defaultRepeat = repeat = false;
            op = in.nextInt();
            in.nextLine();

            switch (op) {
                case 1:
                    cadastroCliente(null);
                    break;
                case 2:
                    consultaClientePorCpf(null);
                    break;    
                case 3:
                    consultaClientesResumidoPorCpf(null);
                    break;
                case 4:
                    consultaClientes(null);
                    break;
                case 5:
                    removeCliente(null);
                    break;
                case 6:
                    Cor.printf("\n");
                    Menu.menuInicial();
                    break;
                case 0:
                    Cor.printf(Color.RED, "O programa foi encerrado... \n");
                    System.exit(0);
                    break;
                default:
                    Cor.printf(Color.CYAN, "\nDigite uma opcao valida! \n \n");
                    defaultRepeat = true;
                    Menu.menuInicial();
                    break;
                }
        } while (repeat || defaultRepeat);
       }
    }

    public static void cadastroCliente(Clientes c) {
        c.add(null);
    }

    public static void consultaClientePorCpf(Clientes c) {
        c.getInfo(0);   
    }

    public static void consultaClientesResumidoPorCpf(Clientes c) {
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
