public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Vendedor A", "Rua E", "111-222", 4, 2000.0, 8.0, 50000.0, 4.0);
        System.out.println(vendedor.toString());
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
    }
}
