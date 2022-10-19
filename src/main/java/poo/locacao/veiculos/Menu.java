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
        Scanner in = new Scanner(System.in);

        Cor.printf(Color.PURPLE, "[MENU - LOCADORA DE VEICULOS]\n\n");
        Cor.printf("    1 - Clientes\n");
        Cor.printf("    2 - Veiculos\n");
        Cor.printf("    3 - Locacoes\n");
        Cor.printf("    0 - Sair\n");
        Cor.printf(Color.YELLOW, "\nDigite uma das opcoes acima: ");
        op = in.nextInt();
        System.out.println("\n");

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
                default:
                    break;
            }
    }
}
