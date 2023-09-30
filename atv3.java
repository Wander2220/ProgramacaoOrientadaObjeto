public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;

    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
     
        if (precoPorItem < 0) {
            this.precoPorItem = 0.0;
        } else {
            this.precoPorItem = precoPorItem;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
   
        if (precoPorItem < 0) {
            this.precoPorItem = 0.0;
        } else {
            this.precoPorItem = precoPorItem;
        }
    }

    public double getTotalFatura() {
        double totalFatura = quantidade * precoPorItem;
        if (totalFatura < 0) {
            return 0.0;
        } else {
            return totalFatura;
        }
    }
}
