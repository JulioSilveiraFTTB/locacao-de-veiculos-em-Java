package poo.locacao.veiculos.objetos;

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

    public Integer getCodigo(){
        return codigo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    public Double getDiaria(){
        return diaria;
    }

    public void setDiaria(Double diaria){
        this.diaria = diaria;
    }

    public LocalDate getDataFinal(){
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal){
        this.dataFinal = dataFinal;
    }

    
}
