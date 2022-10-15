package poo.locacao.veiculos.objetos;

public abstract class Veiculo {
    protected String placa;
    protected int ano;
    protected Double diaria;

    public Veiculo(String placa, int ano, Double diaria){
        this.placa = placa;
        this.ano = ano;
        this.diaria = diaria;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public Double getDiaria(){
        return diaria;
    }

    public void setDiaria(Double diaria){
        this.diaria = diaria;
    }

    public abstract String informacoes();

    @Override
    public String toString(){
        return "Informações do veículo:\n"
             + "Placa: " + placa + "\n"
             + "Ano: " + ano + "\n"
             + "Diária: %2f%n" + getDiaria();
    }
}
