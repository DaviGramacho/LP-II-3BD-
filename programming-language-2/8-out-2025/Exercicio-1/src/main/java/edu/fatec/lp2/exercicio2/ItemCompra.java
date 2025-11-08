package main.java.edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel {
    private int quantidade;
    private Produto produto;
    private double desconto;

    public ItemCompra(Produto produto, double desconto) {
        this.produto = produto;
        this.desconto = desconto > produto.getDescontoMaximo() ? produto.getDescontoMaximo() : desconto;
        this.quantidade = 1;
    }

    public int getQuantidade() { return quantidade; }
    public Produto getProduto() { return produto; }
    public double getDesconto() { return desconto; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public void setProduto(Produto produto) { this.produto = produto; }
    public void setDesconto(double desconto) {
        this.desconto = desconto > produto.getDescontoMaximo() ? produto.getDescontoMaximo() : desconto;
    }

    @Override
    public double calcularPreco() {
        // Valor bruto menos desconto por unidade multiplicado pela quantidade
        double precoUnitarioComDesconto = produto.getPreco() - desconto;
        return precoUnitarioComDesconto * quantidade;
    }
}
