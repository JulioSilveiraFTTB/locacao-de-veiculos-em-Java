package poo.locacao.veiculos.menus;

import poo.locacao.veiculos.objetos.arraylists.*;
import poo.locacao.veiculos.objetos.Cor;
import poo.locacao.veiculos.objetos.tipoveiculo.Caminhao;
import poo.locacao.veiculos.objetos.tipoveiculo.Carro;
import poo.locacao.veiculos.objetos.tipoveiculo.Onibus;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.ArCondicionado;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Categoria;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Color;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Wifi;
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
            Cor.printf(Color.YELLOW, "\n[VEICULOS - LOCADORA DE VEICULOS]\n\n");
            Cor.printf("    1 - Cadastrar novo veiculo\n");
            Cor.printf("    2 - Consultar veiculo (por placa)\n");
            Cor.printf("    3 - Consultar veiculos (por placa/resumido)\n");
            Cor.printf("    4 - Consultar lista completa de veiculos\n");
            Cor.printf("    5 - Remover veiculo\n");
            Cor.printf("    6 - Retornar ao menu principal\n");
            Cor.printf("    0 - Sair\n");
            Cor.printf(Color.YELLOW, "\nDigite uma das opcoes acima: ");
        
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
                    consultaVeiculosResumido();
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
        int op3;
        int op4;
        String placa;
        int ano;
        double diaria;
    	
        do {
        	//menu com as opcoes de tipo de veiculo
            Cor.printf(Color.YELLOW, "[VEICULOS - LOCADORA DE VEICULOS]\n\n");
            Cor.printf("\t Informe o tipo de veiculo que deseja cadastrar:\n");
            Cor.printf("\t 1 - Cadastrar carro\n");
            Cor.printf("\t 2 - Cadastrar onibus\n");
            Cor.printf("\t 3 - Cadastrar caminhao");
            Cor.printf("\t 0 - Sair\n");
            Cor.printf(Color.YELLOW, "\n Digite uma das opcoes acima:\n ");
            op = in.nextInt();
            in.nextLine();
            
            switch(op) {
            case 1:
            	int nPassageiros;
            	int nPortas;
            	double consumo;
            	ArCondicionado arCond = ArCondicionado.NAO;
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
            	
            	do {
            		Cor.printf("Possui ar condicionado?\n1 - SIM\n2 - NÃO\n");
                	
                	Cor.printf("Informe sua opção: ");
                	op2 = in.nextInt();
                	in.nextLine();
                	
                	if(op2 == 1)
                		arCond = ArCondicionado.SIM;
                	else if(op2 == 2)
                		arCond = ArCondicionado.NAO;
                	else
                		System.out.println("Opção invalida!");
            	}while(op2 != 1 && op2 != 2);
            	
            	v = new Carro(placa, ano, diaria, nPassageiros, nPortas,consumo, arCond);
            	
            	lV.add(v);
            	
            	break;
            case 2:
            	int qPessoas;
            	int qPortas;
            	Categoria categoria = Categoria.CONVECIONAL;
            	ArCondicionado arCond1 = ArCondicionado.NAO;
            	Wifi intFio = Wifi.NAO;
            	
            	Cor.printf("\tInforme os dados do Ônibus\n");
                    
            	Cor.printf("Placa:");
            	placa = in.nextLine();
            	
            	Cor.printf("Ano: ");
            	ano = in.nextInt();
            	in.nextLine();
            	
            	Cor.printf("Valor da diaria: ");
            	diaria = in.nextDouble();
            	in.nextLine();
                            
            	Cor.printf("Quantidade de passageiros: ");
            	qPessoas = in.nextInt();
            	in.nextLine();
            	
            	Cor.printf("Qual categoria?\n1 - Leito\n2 - Executivo\n3 - Convencional\n ");
            	Cor.printf("Informe sua opção: ");
            	
            	op3 = in.nextInt();
            	in.nextLine();
            	
            	if(op3 == 1)
            		categoria = Categoria.LEITO;
            	else if(op3 == 2)
            		categoria = Categoria.EXECUTIVO;
            	else if(op3 == 3)
            		categoria = Categoria.CONVECIONAL;
            	
            	Cor.printf("Possui acesso a internet?\n1 - SIM\n2 - NÃO\n");
            	
            	Cor.printf("Informe sua opção: ");
            	op3 = in.nextInt();
            	in.nextLine();
            	
            	if(op3 == 1)
            		intFio = Wifi.SIM;
            	else if(op3 == 2)
            		intFio = Wifi.NAO;
            	else
            		System.out.println("Opção invalida!");
            	
            	Cor.printf("Possui ar condicionado?\n1 - SIM\n2 - NÃO\n");
            	
            	Cor.printf("Informe sua opção: ");
            	op4 = in.nextInt();
            	in.nextLine();
            	
            	if(op4 == 1)
            		arCond1 = ArCondicionado.SIM;
            	else if(op4 == 2)
            		arCond1 = ArCondicionado.NAO;
            	else
            		System.out.println("Opção invalida!");
            		
            	v = new Onibus(placa, ano, diaria, qPessoas, categoria, arCond1,intFio );
            	
            	lV.add(v);
            	break;
            case 3:
            	int nEixos;
                double nCargaMax;
                
                Cor.printf("\tInforme os dados do Caminhão\n");

            	Cor.printf("Placa:");
            	placa = in.nextLine();
            	
            	Cor.printf("Ano: ");
            	ano = in.nextInt();
            	in.nextLine();
            	
            	Cor.printf("Valor da diaria: ");
            	diaria = in.nextDouble();
            	in.nextLine();    
            	
            	Cor.printf("Número de eixos: ");
            	nEixos = in.nextInt();
            	in.nextLine();
            	
            	Cor.printf("Qual a carga máxima: ");
            	nCargaMax = in.nextDouble();
            	in.nextLine();
            	
            	v = new Caminhao(placa, ano, diaria, nEixos, nCargaMax);
            	
            	lV.add(v);
            	break;
            }
            
    	} while(op != 0);
    }
    
    
    public static void consultaVeiculoPorPlaca() {
    	String placa;
    	Cor.printf("Informe a placa do veiculo:");
    	placa = in.nextLine();
    	if(lV.existe(placa)) {
    		Cor.printf("\nEstas são as informações do veiculo:\n");
    	
    	Cor.printf(lV.getInfo(placa));
    	}else
    		Cor.printf("\nEste veiculo não está registrado!\n");       
    }


    public static void consultaVeiculosResumido() {
    	Cor.printf("Estas são as informações resumidas dos veiculos:\n");
    	Cor.printf(lV.getResumoInfo());
    }


    public static void consultaVeiculos() {
    	Cor.printf("Estas são as informações dos veiculos:\n");
    	Cor.printf(lV.getInfo());
    }

	
    public static void editarVeiculo() {
        
    }

    public static void removeVeiculo() {
    	String placa;
    	Cor.printf("Informe a placa do veiculo:");
    	placa = in.nextLine();
    	if(lV.existe(placa)) {
    		Cor.printf(lV.remove(placa));
    		Cor.printf("\nVeiculo removido!\n");
    	
    	}else
    		Cor.printf("\nEste veiculo não está registrado!\n");
    }
}
