package poo.locacao.veiculos;

import poo.locacao.veiculos.objetos.Cor;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Color;
import poo.locacao.veiculos.menus.MenuCliente;
import poo.locacao.veiculos.menus.MenuVeiculo;
import poo.locacao.veiculos.menus.MenuLocacao;

import java.util.Scanner;

public class Menu {

    public static void menuInicial() {
        int op;
        boolean repeat;
        boolean defaultRepeat;

        Cor.printf(Color.PURPLE, "\n[MENU - LOCADORA DE VEICULOS]\n\n");
        Cor.printf("1 - Clientes\n");
        Cor.printf("2 - Veiculos\n");
        Cor.printf("3 - Locacoes\n");
        Cor.printf("0 - Sair\n");
        Cor.printf(Color.PURPLE, "\nDigite uma das opcoes acima: ");

        try (Scanner in = new Scanner(System.in)) {
            do {
                defaultRepeat = repeat = false;
                op = in.nextInt();
                in.nextLine();
    
                switch (op) {
                    case 1:
                        MenuCliente.areaCliente();
                        break;
                    case 2:
                        MenuVeiculo.areaVeiculo();
                        break;    
                    case 3:
                        MenuLocacao.areaLocacao();
                        break;
                    case 0:
                        Cor.printf(Color.RED, "\nO programa foi encerrado... \n");
                        System.exit(0);
                        break;
                    default:
                        Cor.printf(Color.BLUE, "\nDigite uma opcao valida! \n");
                        defaultRepeat = true;
                        break;
                }
            } while (repeat || defaultRepeat);
        }
    }   

    // public static boolean returnToMenu(Scanner scanner) {
    //     Cor.printf(Color.WHITE, "\nDeseja retornar ao menu? (S/N):");
    //     Cor.printf(" ");
    //     boolean repeat = scanner.next().toLowerCase().equals("s");
    //     Cor.clearScreen();
    //     return repeat;
    // }
}
