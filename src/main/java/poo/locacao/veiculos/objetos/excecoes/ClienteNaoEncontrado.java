package poo.locacao.veiculos.objetos.excecoes;

public class ClienteNaoEncontrado extends Exception {
    public ClienteNaoEncontrado(String mensagem) {
        super(mensagem);
    }
}
