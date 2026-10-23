public class PagamentoCartao implements Pagamento {
    private int parcelas;
    private double limite;

    public PagamentoCartao(int parcelas, double limite) {
        this.parcelas = parcelas;
        this.limite = limite;
    }

    @Override
    public double calcularValorFinal(double valor) {
        double total = valor;

        if (parcelas > 3) {
            total *= 1.08;
        }

        if (total > limite) {
            throw new PagamentoRecusadoException();
        }

        return total;
    }

    @Override
    public String getDescricao() {
        return "Cartão";
    }
}