public class Cliente extends Pessoa {
    private String endereco;
    private int pontosFidelidade;

    public Cliente(String nome, String cpf, String email, String endereco) {
        super(nome, cpf, email);
        this.endereco = endereco;
        this.pontosFidelidade = 0;
    }

    public void adicionarPontos(int pontos) {
        pontosFidelidade += pontos;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}