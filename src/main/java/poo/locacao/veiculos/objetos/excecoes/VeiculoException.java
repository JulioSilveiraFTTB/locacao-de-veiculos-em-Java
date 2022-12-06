package poo.locacao.veiculos.objetos.excecoes;

public class VeiculoException extends Exception {
    public VeiculoException(String mensagem) {
        super(mensagem);
    }

    public static boolean placaValida(String placa) throws IllegalArgumentException {
        if(placa == null || placa.isEmpty()){
            throw new IllegalArgumentException("Placa inválida!");
        }
        return true;
    }

    public static boolean anoValido(int ano) throws IllegalArgumentException{
        if (ano == 0 || ano > 9999L){
            throw new IllegalArgumentException("ANO inválido!");
        }
        return true;
    }

    public static boolean passageirosValido(int passageiros) throws IllegalArgumentException{
        if (passageiros == 0 || passageiros > 40L){
            throw new IllegalArgumentException("Passageiros inválido!");
        }
        return true;
    }

    public static boolean portaValido(long porta) throws IllegalArgumentException{
        if (porta == 0 || porta > 5L){
            throw new IllegalArgumentException("Porta inválido!");
        }
        return true;
    }

    public static boolean consumoValido(long consumo) throws IllegalArgumentException{
        if (consumo == 0 || consumo > 999999L){
            throw new IllegalArgumentException("consumo inválido!");
        }
        return true;
    }

    public static boolean valorDiariaValido(long valorDiariaValido) throws IllegalArgumentException{
        if ( valorDiariaValido == 0 || valorDiariaValido > 180L){
            throw new IllegalArgumentException("Valor Diaria inválido!");
        }
        return true;
    }








}
