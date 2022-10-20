package poo.locacao.veiculos.menus;

import poo.locacao.veiculos.objetos.arraylists.*;
import poo.locacao.veiculos.objetos.Cor;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Color;
import poo.locacao.veiculos.Menu;

import java.util.Scanner;

public class MenuVeiculo {
    Veiculos v = new Veiculos();

    public static void areaVeiculo() {
       int op;
       boolean repeat;
       boolean defaultRepeat;
       // menu com as op��es dos m�todos
       Cor.printf(Color.GREEN, "[VEICULOS - LOCADORA DE VEICULOS]\n\n");
       Cor.printf("    1 - Cadastrar novo veiculo\n");
       Cor.printf("    2 - Consultar veiculo (por placa)\n");
       Cor.printf("    3 - Consultar veiculos (por placa/resumido)\n");
       Cor.printf("    4 - Consultar lista completa de veiculos\n");
       Cor.printf("    5 - Remover veiculo\n");
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
                    cadastroVeiculo();
                    break;
                case 2:
                    consultaVeiculoPorPlaca();
                    break;    
                case 3:
                    consultaVeiculosResumidoPorPlaca();
                    break;
                case 4:
                    consultaVeiculos();
                    break;
                case 5:
                    removeVeiculo();
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
                    Cor.printf(Color.CYAN, "\n Digite uma opcao valida! \n");
                    Menu.menuInicial();
                    break;
                }
        } while (repeat || defaultRepeat);
       }
    }

    public static void cadastroVeiculo() {
        
    }

    public static void consultaVeiculoPorPlaca() {
        
    }

    public static void consultaVeiculosResumidoPorPlaca() {
        
    }

    public static void consultaVeiculos() {
        
    }

    public static void editarVeiculo() {
        
    }

    public static void removeVeiculo() {
        
    }
}
