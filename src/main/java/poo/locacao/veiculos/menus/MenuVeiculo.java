package poo.locacao.veiculos.menus;

import poo.locacao.veiculos.objetos.arraylists.*;
import poo.locacao.veiculos.objetos.Cor;
import poo.locacao.veiculos.objetos.tipoveiculo.Carro;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.ArCondicionado;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Color;
import poo.locacao.veiculos.Menu;
import poo.locacao.veiculos.objetos.Veiculo;

import java.util.Scanner;

public class MenuVeiculo {
    private static Veiculos lV = new Veiculos();
    private static Veiculo v;
    private static Scanner in = new Scanner(System.in);
    
    public static void areaVeiculo() {
       int op;
       
        do {
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
                    Cor.printf(Color.CYAN, "\nDigite uma opcao valida! \n");
                    Menu.menuInicial();
                    break;
                }
        } while (op != 0);
       
    }

    public static void cadastroVeiculo() {
    	int op;
    	int op2;
        String placa;
        int ano;
        double diaria;
    	
        do {
        	//menu com as opcoes de tipo de veiculo
            Cor.printf(Color.GREEN, "[VEICULOS - LOCADORA DE VEICULOS]\n\n");
            Cor.printf("\t Informe o tipo de veiculo que deseja cadastrar:");
            Cor.printf("\t 1 - Cadastrar carro\n");
            Cor.printf("\t 2 - Cadastrar onibus\n");
            Cor.printf("\t 3 - Cadastrar casminhao");
            Cor.printf("\t 0 - Sair\n");
            Cor.printf(Color.BLUE, "\n Digite uma das opcoes acima: ");
            op = in.nextInt();
            in.nextLine();
            
            switch(op) {
            case 1:
            	int nPassageiros;
            	int nPortas;
            	double consumo;
            	ArCondicionado arCond;
            	Cor.printf("\tInforme os dados do carro\n");
            	Cor.printf("Placa:");
            	placa = in.nextLine();
            	
            	Cor.printf("Ano: ");
            	ano = in.nextInt();
            	in.nextLine();
            	
            	Cor.printf("Valor da diaria: ");
            	diaria = in.nextDouble();
            	in.nextLine();
            	
            	Cor.printf("Numero de passageiros: ");
            	nPassageiros = in.nextInt();
            	in.nextLine();
            	
            	Cor.printf("Numero de portas: ");
            	nPortas = in.nextInt();
            	in.nextLine();
            	
            	Cor.printf("Consumo: ");
            	consumo = in.nextDouble();
            	in.nextLine();
            	
            	Cor.printf("Possui ar condicionado?\n1 - SIM\n2 - NÃO\n");
            	
            	Cor.printf("Informe sua opção: ");
            	op2 = in.nextInt();
            	in.nextLine();
            	
            	if(op2 == 1)
            		arCond = ArCondicionado.SIM;
            	else
            		arCond = ArCondicionado.NAO;
            	
            	v = new Carro(placa, ano, diaria, nPassageiros, nPortas,consumo, arCond);
            	
            	lV.add(v);
            	
            	break;
            case 2:
            	
            	break;
            case 3:
            	
            	break;
            }
            
    	}while(op != 0);
        
        
        
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
