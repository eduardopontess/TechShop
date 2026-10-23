
public class Main {
    public static void main(String[] args) {

        ClienteVip cliente = new ClienteVip(
            "Eduardo",
            "eduardo@email.com",
            10
        );

        ProdutoFisico fisico = new ProdutoFisico(
            "Teclado",
            100.0,
            2.0
        );

        ProdutoDigital digital = new ProdutoDigital(
            "Curso Java",
            50.0,
            100
        );

        Assinatura assinatura = new Assinatura(
            "Plano Premium",
            30.0
        );

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(fisico);
        carrinho.adicionarProduto(digital);
        carrinho.adicionarProduto(assinatura);

        System.out.println("=== CARRINHO ===");
        System.out.println(carrinho);

        double total = carrinho.calcularTotal();

        System.out.println("Total: R$ " + total);

        System.out.println("\n=== PRIMEIRA TENTATIVA ===");

        CartaoCredito cartao1 = new CartaoCredito(
            "1234567890123456",
            12,
            total + 500.0
        );

        try {
            carrinho.finalizarCompra(cliente, cartao1, 1);
            System.out.println("Pagamento aprovado!");
        } catch (Exception e) {
            System.out.println("Pagamento recusado: " + e.getMessage());
        }

        System.out.println("\n=== SEGUNDA TENTATIVA ===");

        CartaoCredito cartao2 = new CartaoCredito(
            "9876543210987654",
            6,
            total - 1.0
        );

        try {
            carrinho.finalizarCompra(cliente, cartao2, 6);
            System.out.println("Pagamento aprovado!");
        } catch (Exception e) {
            System.out.println("Pagamento recusado: " + e.getMessage());
        }
    }
}
