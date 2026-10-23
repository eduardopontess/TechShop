public interface Pagamento {
    double calcularValorFinal(double valor);

    String getDescricao();

    default void exibirComprovante(double valor) {
        System.out.println(
            "Pago via " + getDescricao()
            + ": R$ " + calcularValorFinal(valor)
        );
    }
}