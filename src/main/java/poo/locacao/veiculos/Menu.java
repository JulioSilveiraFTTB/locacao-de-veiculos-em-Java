package poo.locacao.veiculos;

import poo.locacao.veiculos.objetos.Cor;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Color;

public class Menu {
    public static void menuInicial() {
        Cor.printf(Color.PURPLE, "[MENU - LOCADORA DE VEICULOS]\n\n");
        Cor.printf("    1 - Clientes\n");
        Cor.printf("    2 - Veiculos\n");
        Cor.printf("    3 - Locacoes\n");
        Cor.printf("    0 - Sair\n");
        Cor.printf(Color.YELLOW, "\nDigite uma das opcoes acima: ");
    }
}
