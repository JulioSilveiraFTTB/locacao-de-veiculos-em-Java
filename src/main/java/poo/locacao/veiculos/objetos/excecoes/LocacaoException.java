package poo.locacao.veiculos.objetos.excecoes;

public class LocacaoException extends Exception {
    public LocacaoException(String mensagem) {
        super(mensagem);
    }

    public static boolean cpfValido(long cpf) throws IllegalArgumentException{
        if ( cpf == 0 || cpf > 99999999999L){
            throw new IllegalArgumentException("CPF inválido!");
        }
        return true;
    }

    public static boolean placaValida(String placa) throws IllegalArgumentException {
        if(placa == null || placa.isEmpty()){
            throw new IllegalArgumentException("Placa inválida!");
        }
        return true;
    }

    public static boolean nomeValido(String nome) throws IllegalArgumentException {
        if (nome == null || nome.isEmpty() || nome.matches("[0-9]*")) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        return true;
    }

    public static boolean codigoValido(long codigo) throws IllegalArgumentException{
        if ( codigo == 0 || codigo > 99999999L){
            throw new IllegalArgumentException("Codigo inválido!");
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
