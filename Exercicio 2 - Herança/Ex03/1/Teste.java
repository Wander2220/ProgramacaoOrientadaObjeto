public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Fornecedor A", "Rua A", "123-456", 5000.0, 2000.0);
        System.out.println(fornecedor.toString());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}
