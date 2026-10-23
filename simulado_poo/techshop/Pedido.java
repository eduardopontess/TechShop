public class Pedido {
    private Cliente cliente;
    private CarrinhoDeCompras carrinho;

    public Pedido(Cliente cliente, CarrinhoDeCompras carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public void finalizar(Pagamento pagamento) {
        try {
            String cep = cliente.getEndereco();

            double subtotal = carrinho.calcularTotal()
                            + carrinho.calcularFreteTotal(cep);

            if (cliente instanceof ClienteVip) {
                ClienteVip vip = (ClienteVip) cliente;
                subtotal *= (1 - vip.getPercentualDesconto());
            }

            double valorFinal = pagamento.calcularValorFinal(subtotal);
            pagamento.exibirComprovante(subtotal);

            cliente.adicionarPontos((int) (valorFinal / 10));

        } catch (PagamentoRecusadoException e) {
            System.out.println("Pagamento recusado");
        } finally {
            System.out.println("Pedido encerrado");
        }
    }
}