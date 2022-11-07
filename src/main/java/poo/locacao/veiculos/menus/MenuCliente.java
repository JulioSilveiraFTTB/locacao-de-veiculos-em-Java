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

    private static Scanner in = new Scanner(System.in);

    public static void areaCliente() {
       int op;
       boolean defaultRepeat;
       boolean repeat;
       // menu com as op��es dos m�todos
       Cor.printf(Color.GREEN, "\n[CLIENTES - LOCADORA DE VEÍCULOS]\n\n");
       Cor.printf("    1 - Cadastrar novo cliente\n");
       Cor.printf("    2 - Consultar cliente (por CPF)\n");
       Cor.printf("    3 - Consultar clientes (resumidos)\n");
       Cor.printf("    4 - Consultar lista completa de clientes\n");
       Cor.printf("    5 - Editar cliente\n");
       Cor.printf("    6 - Remover cliente\n");
       Cor.printf("    7 - Retornar ao menu principal\n");
       Cor.printf("    0 - Sair\n");
       Cor.printf(Color.GREEN, "\nDigite uma das opções acima: ");
   
       op = in.nextInt();
       in.nextLine();

        do {
            defaultRepeat = repeat = false;

            switch (op) {
                case 1:
                    cadastroCliente();
                    areaCliente();
                    break;
                case 2:
                    consultaClientePorCpf();
                    areaCliente();
                    break;    
                case 3:
                    consultaClientesResumidoPorCpf();
                    areaCliente();
                    break;
                case 4:
                    consultaClientes();
                    areaCliente();
                    break;
                case 5:
                    editarCliente();
                    areaCliente();
                    break;
                case 6:
                    removeCliente();
                    areaCliente();
                    break;    
                case 7:
                    Cor.printf("\n");
                    Menu.menuInicial();
                    break;
                case 0:
                    Cor.printf(Color.RED, "O programa foi encerrado... \n");
                    System.exit(0);
                    break;
                default:
                    Cor.printf(Color.CYAN, "\nDigite uma opção válida! \n \n");
                    defaultRepeat = true;
                    Menu.menuInicial();
                    break;
                }
        } while (op != 0);
    }

    public static void cadastroCliente() {
        String nome;
        String endereco;
        long cpf;
        long cnh;
        long telefone;

        Cor.printf(Color.GREEN, "\n[CLIENTES - CADASTRAR NOVO CLIENTE]\n \n");
        Cor.printf("Para realizar um novo cadastro, primeiro informe o nome do cliente: ");
        nome = in.nextLine();
        // cliente.setNome(nome);

        Cor.printf("Agora, informe o endereço do cliente: ");
        endereco = in.nextLine();
        // cliente.setEndereco(endereco);

        Cor.printf("Informe o CPF do cliente: ");
        cpf = in.nextLong();
        // cliente.setCpf(cpf);

        Cor.printf("Informe a CNH do cliente: ");
        cnh = in.nextLong();
        // cliente.setCnh(cnh);

        Cor.printf("Por fim, informe o telefone: ");
        telefone = in.nextLong();
        // cliente.setTelefone(telefone);

        cliente = new Cliente(nome, endereco, cpf, cnh, telefone);
        c.add(cliente);
    }

    public static void consultaClientePorCpf() {
        long cpf;

        Cor.printf(Color.GREEN, "\n[CLIENTES - CONSULTAR CLIENTE (POR CPF)]\n");
        Cor.printf("Para consultar um cliente cadastrado no sistema, informe o CPF do mesmo: ");
        cpf = in.nextLong();

        if(c.existe(cpf)){
            // Cor.printf("O cliente solicitado:\n ");
            Cor.printf(c.getInfo(cpf));
        } else
            Cor.printf("\nO cliente não está cadastrado no sistema!\n");
    }

    public static void consultaClientesResumidoPorCpf() {
        Cor.printf(Color.GREEN, "\n[CLIENTES - CONSULTAR CLIENTES (RESUMIDO)]\n \n");
        Cor.printf("Informações resumidas de todos os clientes da locadora: \n");
        Cor.printf(c.getResumoInfo());
    }

    public static void consultaClientes() {
        Cor.printf(Color.GREEN, "\n[CLIENTES - LISTAR CLIENTES]\n");
        Cor.printf(c.getInfo());
    }

    public static void editarCliente() {
        String nome;
        String endereco;
        long cpf;
        long telefone;

        Cor.printf(Color.GREEN, "\n[CLIENTES - EDITAR INFORMAÇÕES DO CLIENTE]\n");
        Cor.printf("Para editar as informações de um cliente, informe o CPF do mesmo: ");
        cpf = in.nextLong();

        for(Cliente cliente : c.getClientes()){
            if(c.existe(cpf)){
                Scanner entrada = new Scanner(System.in);

                Cor.printf("Informe o nome do cliente: ");
                nome = entrada.nextLine();

                Cor.printf("Informe o novo endereço para o cliente: ");
                endereco = entrada.nextLine();
    
                Cor.printf("Informe o novo telefone do cliente: ");
                telefone = entrada.nextLong();
    
                cliente.setNome(nome);
                cliente.setEndereco(endereco);
                cliente.setTelefone(telefone);
    
                c.set(cpf, cliente);
            } else
                Cor.printf("\nO cliente não está cadastrado no sistema!\n");
        }
    }

    public static void removeCliente() {
        long cpf;

        Cor.printf(Color.GREEN, "\n[CLIENTES - REMOVER CLIENTES]\n");
        Cor.printf("Informe o CPF do cliente para removê-lo do sistema: ");
        cpf = in.nextLong();
    
        if(c.existe(cpf)) {
            c.remove(cpf);
            Cor.printf("\nCliente removido!\n");
        } else
            Cor.printf("\nO CPF informado não está registrado no sistema!\n");
    }
}
