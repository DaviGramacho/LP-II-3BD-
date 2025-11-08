package main.java.edu.fatec.lp2.exercicio2;

public class Produto {
    private String nome;
    private String unidade;
    private String descricao;
    private double preco;
    private double descontoMaximo;
    private Supermercado supermercado;

    public Produto(String nome, String unidade, String descricao, double preco, double descontoMaximo, Supermercado supermercado) {
        this.nome = nome;
        this.unidade = unidade;
        this.descricao = descricao;
        this.preco = preco;
        this.descontoMaximo = descontoMaximo;
        this.supermercado = supermercado;
    }

    public String getNome() { return nome; }
    public String getUnidade() { return unidade; }
    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }
    public double getDescontoMaximo() { return descontoMaximo; }
    public Supermercado getSupermercado() { return supermercado; }

    public void setNome(String nome) { this.nome = nome; }
    public void setUnidade(String unidade) { this.unidade = unidade; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setDescontoMaximo(double descontoMaximo) { this.descontoMaximo = descontoMaximo; }
    public void setSupermercado(Supermercado supermercado) { this.supermercado = supermercado; }

    @Override
    public String toString() {
        return nome;
    }
}
