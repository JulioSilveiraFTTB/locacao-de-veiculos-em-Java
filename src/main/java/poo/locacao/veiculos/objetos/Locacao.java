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

    /**
     * Construtor do objeto Veiculo
     * 
     * @param cliente
     * @param veiculo
     * @param diaria
     * @param dataInicial
     * @param dataFinal
     */
    public Locacao(Cliente cliente, Veiculo veiculo, Double diaria, LocalDate dataInicial, LocalDate dataFinal){
        Random random = new Random();

        this.codigo = random.nextInt(10000000);
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.diaria = diaria;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    /**
     * Retorna o código identificador da locação
     * 
     * @param codigo
     */
    public Integer getCodigo(){
        return codigo;
    }

    /**
     * Retorna o cliente que realizou a locação
     * 
     * @param cliente
     */
    public Cliente getCliente(){
        return cliente;
    }

    /**
     * Atribui o cliente que irá realizar a locação
     * 
     * @param cliente
     */
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

     /**
     * Retorna o veículo alugado
     * 
     * @param veiculo
     */
    public Veiculo getVeiculo(){
        return veiculo;
    }

    /**
     * Atribui o veiculo que será alugado
     * 
     * @param veiculo
     */
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    /**
     * Retorna a diária da locação
     * 
     * @param diaria
     */
    public Double getDiaria(){
        return diaria;
    }

    /**
     * Atribui o valor da diária da locação
     * 
     * @param diaria
     */
    public void setDiaria(Double diaria){
        this.diaria = diaria;
    }

     /**
     * Retorna a data final da locação
     * 
     * @param dataFinal
     */
    public LocalDate getDataFinal(){
        return dataFinal;
    }

    /**
     * Atribui a data final da locação
     * 
     * @param dataFinal
     */
    public void setDataFinal(LocalDate dataFinal){
        this.dataFinal = dataFinal;
    }

    /**
     * Retorna a String completa da locação
     * 
     * @return
     */
    @Override
    public String toString(){
        return "Informações da locação: \nCódigo: " + codigo + "\n"
               + "Cliente: " + cliente.getNome() + "\n"
               + "Veículo: " + veiculo + "\n"
               + "Diária: " + diaria + "\n"
               + "Data inicial: " + dtf.format(dataInicial) + "\n"
               + "Data final: " + dtf.format(dataFinal) + "\n";
    }
}
