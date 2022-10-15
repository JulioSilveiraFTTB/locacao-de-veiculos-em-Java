package poo.locacao.veiculos.objetos;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Locacao {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final Integer codigo;
    private Cliente cliente;
    private Veiculo veiculo;
    private Double diaria;
    private final LocalDate dataInicial;
    private LocalDate dataFinal;

    public Locacao(Cliente cliente, Veiculo veiculo, Double diaria, LocalDate dataInicial, LocalDate dataFinal){
        Random random = new Random();

        this.codigo = random.nextInt(10000000);
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.diaria = diaria;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }
}
