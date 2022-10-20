package poo.locacao.veiculos.menus;

import poo.locacao.veiculos.objetos.arraylists.*;
import poo.locacao.veiculos.objetos.tipoveiculo.enums.Color;
import poo.locacao.veiculos.Menu;
import poo.locacao.veiculos.objetos.Cor;
import poo.locacao.veiculos.objetos.Cliente;

import java.util.Scanner;

public class MenuCliente {
    Clientes c = new Clientes();
    Cliente cliente = new Cliente(null, null, 0, 0, 0);

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
                    cadastroCliente(null, null);
                    break;
                case 2:
                    consultaClientePorCpf(null, null);
                    break;    
                case 3:
                    consultaClientesResumidoPorCpf(null, null);
                    break;
                case 4:
                    consultaClientes(null, null);
                    break;
                case 5:
                    removeCliente(null, null);
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

    public static void cadastroCliente(Clientes c, Cliente cliente) {
        String nome;
        String endereco;
        long cpf;
        long cnh;
        long telefone;

        Scanner in = new Scanner(System.in);

        Cor.printf(Color.GREEN, "\n[CLIENTES - CADASTRAR NOVO CLIENTE]\n \n");
        Cor.printf("Para realizar um novo cadastro, primeiro informe o nome do cliente: \n");
        nome = in.nextLine();
        cliente.setNome(nome);

        Cor.printf("Agora, informe o endereco do cliente: \n");
        endereco = in.nextLine();
        cliente.setEndereco(endereco);

        Cor.printf("Informe o CPF do cliente: \n");
        cpf = in.nextLong();
        cliente.setCpf(cpf);

        Cor.printf("Informe a CNH do cliente: \n");
        cnh = in.nextLong();
        cliente.setCnh(cnh);

        Cor.printf("Por fim, informe o telefone: \n");
        telefone = in.nextLong();
        cliente.setTelefone(telefone);

        cliente = new Cliente(nome, endereco, cpf, cnh, telefone);
        c.add(cliente);
        Cor.printf(Cor.GREEN, "O cliente foi cadastrado com sucesso!");
    }

    public static void consultaClientePorCpf(Clientes c, Cliente cliente) {
        c.getInfo(0);   
    }

    public static void consultaClientesResumidoPorCpf(Clientes c, Cliente cliente) {
        c.getResumoInfo();  
    }

    public static void consultaClientes(Clientes c, Cliente cliente) {
        c.getInfo();  
    }

    // public static void editarCliente(Clientes c, Clientes c, Cliente cliente) {
        
    // }

    public static void removeCliente(Clientes c, Cliente cliente) {
        c.remove(0);
    }
}
