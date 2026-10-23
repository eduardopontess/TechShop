public class PagamentoPix implements Pagamento {
    @Override
    public double calcularValorFinal(double valor) {
        return valor * 0.95;
    }

    @Override
    public String getDescricao() {
        return "Pix";
    }
}