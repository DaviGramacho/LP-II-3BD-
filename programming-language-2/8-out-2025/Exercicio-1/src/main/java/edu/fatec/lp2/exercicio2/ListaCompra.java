package main.java.edu.fatec.lp2.exercicio2;
public class ListaCompra implements Calculavel {
    private ItemCompra[] itensCompra;
    private int qtdeMax;
    private int posicaoAtual;

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = new ItemCompra[qtdeMax];
        this.posicaoAtual = 0;
    }

    public void incluir(ItemCompra item) {
        if (posicaoAtual < qtdeMax) {
            itensCompra[posicaoAtual] = item;
            posicaoAtual++;
        } else {
            throw new RuntimeException("Lista de compras cheia.");
        }
    }

    @Override
    public double calcularPreco() {
        double total = 0.0;
        for (int i = 0; i < posicaoAtual; i++) {
            total += itensCompra[i].calcularPreco();
        }
        return total;
    }

    public ItemCompra[] getItensCompra() {
        return java.util.Arrays.copyOf(itensCompra, posicaoAtual);
    }
}
