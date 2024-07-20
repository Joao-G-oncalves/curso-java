package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private long cod;
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(long cod, String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    @Override
    public int compareTo(Produto p) {
        // TODO Auto-generated method stub
        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getCod() {
        return cod;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [cod=" + cod + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }    
}
class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}

