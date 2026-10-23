public class ProdutoFisico extends Produto implements Entregavel {
    private double pesoKg;

    public ProdutoFisico(String codigo, String nome,
                         double precoBase, int estoque, double pesoKg) {
        super(codigo, nome, precoBase, estoque);
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.10;
    }

    @Override
    public double calcularFrete(String cep) {
        return 15.0 + 2.0 * pesoKg;
    }

    @Override
    public int prazoEntregaDias() {
        return cep.startsWith("6") ? 7 : 12;
    }
}