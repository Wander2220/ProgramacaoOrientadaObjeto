public class FaturaTeste {
    public static void main(String[] args) {

        Fatura fatura1 = new Fatura("001", "Teclado", 2, 25.0);
        Fatura fatura2 = new Fatura("002", "Mouse", 3, -15.0); 

        exibirFatura(fatura1);
        exibirFatura(fatura2);
    }
    public static void exibirFatura(Fatura fatura) {
        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por Item: " + fatura.getPrecoPorItem());
        System.out.println("Total da Fatura: " + fatura.getTotalFatura());
        System.out.println(); 
    }
}
