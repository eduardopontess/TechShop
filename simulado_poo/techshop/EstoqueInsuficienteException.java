public class EstoqueInsuficienteException extends Exception {
    public EstoqueInsuficienteException(String nome, int qtd) {
        super("Estoque insuficiente para " + nome
              + ". Disponível: " + qtd);
    }
}