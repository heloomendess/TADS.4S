package modelo;

public class Item extends Produto {

    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", getPreco=" + getPreco +
                '}';
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
