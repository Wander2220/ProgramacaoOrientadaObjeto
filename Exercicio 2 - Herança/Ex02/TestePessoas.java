public class TestePessoas {
    public static void main(String[] args) {

        Empregado empregado = new Empregado("João", 30, "Masculino", 3000.0, "123456");
        Cliente cliente = new Cliente("Maria", 25, "Feminino", 1500.0, 1998);
        Vendedor vendedor = new Vendedor("Carlos", 28, "Masculino", 2500.0, "789012", 5000.0, 10);
        Gerente gerente = new Gerente("Ana", 35, "Feminino", 4000.0, "345678", "Vendas");

        System.out.println("Informações do Empregado:");
        System.out.println(empregado.toString());
        System.out.println("INSS: " + empregado.valorInss());

        System.out.println("\nInformações do Cliente:");
        System.out.println(cliente.toString());

        System.out.println("\nInformações do Vendedor:");
        System.out.println(vendedor.toString());

        System.out.println("\nInformações do Gerente:");
        System.out.println(gerente.toString());
        }
}
