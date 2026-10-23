public abstract class Produto {
    private String codigo;
    private String nome;
    private double precoBase;
    private int estoque;

    public Produto(String codigo, String nome,
                   double precoBase, int estoque) {
        if (precoBase < 0) {
            throw new IllegalArgumentException();
        }

        this.codigo = codigo;
        this.nome = nome;
        this.precoBase = precoBase;
        this.estoque = estoque;
    }

    public abstract double calcularPrecoFinal();

    public String exibirResumo() {
        return codigo + " - " + nome + ": R$ "
               + calcularPrecoFinal();
    }

    public void baixarEstoque(int quantidade) {
        estoque -= quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public int getEstoque() {
        return estoque;
    }
}