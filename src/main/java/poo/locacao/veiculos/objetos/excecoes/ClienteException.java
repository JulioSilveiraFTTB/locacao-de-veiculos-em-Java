package poo.locacao.veiculos.objetos.excecoes;

public class ClienteException extends Exception {
    public ClienteException(String mensagem) {
        super(mensagem);
    }

    public static boolean nomeValido(String nome) throws IllegalArgumentException {
        if (nome == null || nome.isEmpty() || nome.matches("[0-9]*")) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        return true;
    }

    public static boolean cpfValido(long cpf) throws IllegalArgumentException{
        if (cpf == 0 || cpf > 99999999999L){
            throw new IllegalArgumentException("CPF inválido!");
        }
        return true;
    }

    public static boolean numCarteiraMotoristaValido(long numCarteiraMotorista) throws IllegalArgumentException{
        if (numCarteiraMotorista <= 0 || numCarteiraMotorista > 99999999999L){
            throw new IllegalArgumentException("Número de carteira inválido!");
        }
        return true;
    }

    public static boolean enderecoValido(String endereco) throws IllegalArgumentException{
        if (endereco == null || endereco.isEmpty()){
            throw new IllegalArgumentException("Endereço inválido!");
        }
        return true;
    }

    public static boolean telefoneValido(long telefone) throws IllegalArgumentException{
        if (telefone == 0 || telefone > 99999999999L){
            throw new IllegalArgumentException("Telefone inválido!");
        }
        return true;
    }
}
