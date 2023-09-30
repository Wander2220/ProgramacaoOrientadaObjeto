import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cadastro de Pessoa");
        System.out.print("Nome: ");
        String nomePessoa = scanner.nextLine();
        System.out.print("Idade: ");
        int idadePessoa = scanner.nextInt();
        
        System.out.println("Cadastro de Pet");
        scanner.nextLine(); 
        System.out.print("Nome do Pet: ");
        String nomePet = scanner.nextLine();
        System.out.print("Espécie do Pet: ");
        String especiePet = scanner.nextLine();
        
        System.out.println("Cadastro de Veículo");
        System.out.print("Marca do Veículo: ");
        String marcaVeiculo = scanner.nextLine();
        System.out.print("Modelo do Veículo: ");
        String modeloVeiculo = scanner.nextLine();
        
        System.out.println("\nDados Cadastrados:");
        System.out.println("Pessoa: " + nomePessoa + ", Idade: " + idadePessoa);
        System.out.println("Pet: " + nomePet + ", Espécie: " + especiePet);
        System.out.println("Veículo: " + marcaVeiculo + ", Modelo: " + modeloVeiculo);
        
        scanner.close();
    }
}
