package poo.locacao.veiculos.menus;

import poo.locacao.veiculos.objetos.arraylists.*;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Color;
import poo.locacao.veiculos.Menu;
import poo.locacao.veiculos.objetos.Cor;
import poo.locacao.veiculos.objetos.Cliente;

import java.util.Scanner;

public class MenuCliente {
    private static Clientes c = new Clientes();
    private static Cliente cliente;

    public static void areaCliente() {
       int op;
       boolean repeat;
       boolean defaultRepeat;
       // menu com as op��es dos m�todos
       Cor.printf(Color.GREEN, "\n[CLIENTES - LOCADORA DE VEICULOS]\n\n");
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
                    cadastroCliente();
                    areaCliente();
                    break;
                case 2:
                    consultaClientePorCpf();
                    break;    
                case 3:
                    consultaClientesResumidoPorCpf();
                    break;
                case 4:
                    consultaClientes();
                    break;
                case 5:
                    removeCliente();
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

    public static void cadastroCliente() {
        String nome;
        String endereco;
        long cpf;
        long cnh;
        long telefone;

        Scanner in = new Scanner(System.in);

        Cor.printf(Color.GREEN, "\n[CLIENTES - CADASTRAR NOVO CLIENTE]\n \n");
        Cor.printf("Para realizar um novo cadastro, primeiro informe o nome do cliente: \n");
        nome = in.nextLine();
        // cliente.setNome(nome);

        Cor.printf("Agora, informe o endereco do cliente: \n");
        endereco = in.nextLine();
        // cliente.setEndereco(endereco);

        Cor.printf("Informe o CPF do cliente: \n");
        cpf = in.nextLong();
        // cliente.setCpf(cpf);

        Cor.printf("Informe a CNH do cliente: \n");
        cnh = in.nextLong();
        // cliente.setCnh(cnh);

        Cor.printf("Por fim, informe o telefone: \n");
        telefone = in.nextLong();
        // cliente.setTelefone(telefone);

        cliente = new Cliente(nome, endereco, cpf, cnh, telefone);
        c.add(cliente);
    }

    public static void consultaClientePorCpf() {
        long cpfInformado;

        Scanner in = new Scanner(System.in);

        Cor.printf(Color.GREEN, "\n[CLIENTES - CONSULTAR CLIENTE (POR CPF)]\n \n");
        Cor.printf("Para consultar um cliente cadastrado no sistema, informe o CPF do mesmo: \n");
        cpfInformado = in.nextLong();

        c.getInfo(cpfInformado);
    }

    public static void consultaClientesResumidoPorCpf() {
        long cpf;

        Scanner in = new Scanner(System.in);

        Cor.printf(Color.GREEN, "\n[CLIENTES - CONSULTAR CLIENTE RESUMIDO (POR CPF)]\n \n");
        Cor.printf("Para consultar um cliente cadastrado no sistema, informe o CPF do mesmo: \n");
        cpf = in.nextLong();

        c.getResumoInfo();  
    }

    public static void consultaClientes() {
        Cor.printf(Color.GREEN, "\n[CLIENTES - LISTAR CLIENTES]\n \n");
        
        c.getClientes();      
        // c.getInfo();  
    }

    // public static void editarCliente(Clientes c, Clientes c, Cliente cliente) {
        
    // }

    public static void removeCliente() {
        long cpf;

        Scanner in = new Scanner(System.in);

        Cor.printf(Color.GREEN, "\n[CLIENTES - REMOVER CLIENTE]\n \n");
        Cor.printf("Para remover um cliente do sistema, informe o CPF cadastrado: \n");
        cpf = in.nextLong();

        c.remove(cpf);
    }
}
