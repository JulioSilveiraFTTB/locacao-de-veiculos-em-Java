package poo.locacao.veiculos.menus;

import poo.locacao.veiculos.objetos.arraylists.*;
import poo.locacao.veiculos.objetos.Cor;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Color;
import poo.locacao.veiculos.Menu;
import java.time.LocalDate;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Seguro;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import poo.locacao.veiculos.objetos.Locacao;
import java.util.Scanner;

public class MenuLocacao {
    private static Locacoes lO = new Locacoes();
    private static Locacao o;
    private static Scanner in = new Scanner(System.in);
    
    public static void areaLocacao() {
       int op;

        do{    
            // menu com as op��es dos m�todos
            Cor.printf(Color.CYAN, "\n[LOCACAO - LOCADORA DE VEICULOS]\n\n");
            Cor.printf("    1 - Cadastrar nova locacao\n");
            Cor.printf("    2 - Consultar locacao (por código)\n");
            Cor.printf("    3 - Consultar lista completa de locacao\n");
            Cor.printf("    4 - Edita locação:\n");
            Cor.printf("    5 - Remover locacao\n");
            Cor.printf("    6 - Retornar ao menu principal\n");
            Cor.printf("    0 - Sair\n");
            Cor.printf(Color.CYAN, "\nDigite uma das opcoes acima: ");
        
            op = in.nextInt();
            in.nextLine();
            
            switch (op) {
                case 1:
                    cadastroLocacao();
                    break;
                case 2:
                    cadastroLocacaoCodigo();
                    break;    
                case 3:
                    consultaLocacao();
                    break;
                case 4:
                    editarLocacao();
                    break;
                case 5:
                    removeLocacao();
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
                    Cor.printf(Color.CYAN, "\nDigite uma opcao valida! \n");
                    Menu.menuInicial();
                    break;
                }
        } while (op != 0);

    }
    


    public static void cadastroLocacao(){
        String placa;
        Long cpf;
        int op;
        Seguro seg = Seguro.NAO;

        Cor.printf("\tInforme os dados da Locação\n");

        Cor.printf("CPF:");
        cpf = in.nextLong();

        Cor.printf("Placa:");
        placa = in.nextLine();

        do {
            Cor.printf("Possui seguro?\n1 - SIM\n2 - NÃO\n");
            
            Cor.printf("Informe sua opção: ");
            op = in.nextInt();
            in.nextLine();
            if(op == 1)
                seg = Seguro.SIM;
            else if(op == 2)
                seg = Seguro.NAO;
            else
                System.out.println("Opção invalida!");
        }while(op != 1 && op != 2);

        Cor.printf("Informe a data Inicial da locação:");
        



    }

    public static void cadastroLocacaoCodigo() {
        int codigo;
        Cor.printf("Informe o codigo da locação:");
        codigo = in.nextInt();
        if(lO.existe(codigo)) {
            Cor.printf("\nEstas são as informações da locação:\n");

        Cor.printf(lO.getInfo(codigo));
        }else
            Cor.printf("\nEste codigo não esta registrado!\n");
    }

    public static void consultaLocacao(){
        Cor.printf("Estas são as informações das locações:\n");
        Cor.printf(lO.getInfo());

    }

    public static void editarLocacao() {
        
    }

    
    public static void removeLocacao() {
        int codigo;
        Cor.printf("Informe o codigo da locação:");
        codigo = in.nextInt();
        if(lO.existe(codigo)) {
            Cor.printf(lO.remove(codigo));
            Cor.printf("\nLocação Removida!\n");

        }else
            Cor.printf("\nEsta locaçõa não está registrada!\n");
    }
}
