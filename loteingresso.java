package Sistema_de_Gerenciamento_de_Bilheteria;

public class LoteIngresso {
    private int idLote;
    private CategoriaIngresso categoria;
    private int quantidadeDisponivel;
    private double precoLote;

    public LoteIngresso(int idLote, CategoriaIngresso categoria, int quantidadeDisponivel, double precoLote) {
        this.idLote = idLote;
        this.categoria = categoria;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.precoLote = precoLote;
    }

    public int getIdLote() {
        return idLote;
    }

    public CategoriaIngresso getCategoria() {
        return categoria;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public double getPrecoLote() {
        return precoLote;
    }

    public boolean venderIngresso(int quantidade) {
        if (quantidade <= quantidadeDisponivel) {
            quantidadeDisponivel -= quantidade;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "LoteIngresso{" +
                "idLote=" + idLote +
                ", categoria=" + categoria.getNomeCategoria() +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                ", precoLote=" + precoLote +
                '}';
    }
}
