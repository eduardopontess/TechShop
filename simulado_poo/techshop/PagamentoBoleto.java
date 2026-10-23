public class PagamentoBoleto implements Pagamento {
    @Override
    public double calcularValorFinal(double valor) {
        return valor;
    }

    @Override
    public String getDescricao() {
        return "Boleto";
    }
}