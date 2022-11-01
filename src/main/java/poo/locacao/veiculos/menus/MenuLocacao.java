package poo.locacao.veiculos.menus;

import poo.locacao.veiculos.objetos.arraylists.*;
import poo.locacao.veiculos.objetos.*;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.*;

import java.util.Scanner;

public class MenuLocacao {
    private static Scanner in = new Scanner(System.in);
    
    public static void areaLocacao() {
       int op;
       // menu com as op��es dos m�todos
       Cor.printf(Color.CYAN, "\n[LOCACAO - LOCADORA DE VEICULOS]\n\n");
       Cor.printf("    1 - Cadastrar nova locacao\n");
       Cor.printf("    2 - Consultar locacao (por código)\n");
       Cor.printf("    3 - Consultar locacoes (resumidos)\n");
       Cor.printf("    4 - Consultar lista completa de locacao\n");
       Cor.printf("    5 - Remover locacao\n");
       Cor.printf("    6 - Retornar ao menu principal\n");
       Cor.printf("    0 - Sair\n");
       Cor.printf(Color.CYAN, "\nDigite uma das opcoes acima: ");
   
       op = in.nextInt();
       in.nextLine();
    }


    public static void cadastroLocacao() {
        
}


    public static void consultaLocacao() {
        
    }


    public static void editarLocacao() {
        
    }

    
    public static void removeLocacao() {
        
    }
}
