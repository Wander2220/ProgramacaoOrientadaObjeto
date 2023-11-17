public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("Operario A", "Rua D", "987-654", 3, 2500.0, 5.0, 10000.0, 2.5);
        System.out.println(operario.toString());
        System.out.println("Salário Líquido: " + operario.calcularSalario());
    }
}
