public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Admin A", "Rua C", "345-678", 2, 4000.0, 15.0, 500.0);
        System.out.println(administrador.toString());
        System.out.println("Salário Líquido: " + administrador.calcularSalario());
    }
}
