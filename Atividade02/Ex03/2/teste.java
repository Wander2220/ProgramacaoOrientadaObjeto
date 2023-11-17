public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Empregado A", "Rua B", "789-012", 1, 3000.0, 10.0);
        System.out.println(empregado.toString());
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
    }
}
