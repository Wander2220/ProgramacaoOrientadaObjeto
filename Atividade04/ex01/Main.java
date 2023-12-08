public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        Veiculo veiculo;

  
        do {
        
            System.out.println("1. Inserir moto");
            System.out.println("2. Inserir carro");
            System.out.println("0. Sair");

         
            opcao = scanner.nextInt();

         
            switch (opcao) {
                case 1:
             
                veiculo = new Moto();

                System.out.println("Digite o modelo da moto:");
                veiculo.setModelo(scanner.nextLine());

                System.out.println("Digite o preço da moto:");
                veiculo.setPreco(scanner.nextDouble());

                System.out.println("Digite as cilindradas da moto:");
                ((Moto) veiculo).setCilindradas(scanner.nextInt());

                break;
            case 2:
            
                veiculo = new Carro();

                System.out.println("Digite o modelo do carro:");
                veiculo.setModelo(scanner.nextLine());

                System.out.println("Digite o preço do carro:");
                veiculo.setPreco(scanner.nextDouble());

                System.out.println("Digite o ano do carro:");
                ((Carro) veiculo).setAno(scanner.nextInt());

                System.out.println("Digite a quilometragem do carro:");
                ((Carro) veiculo).setKm(scanner.nextDouble());

                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    } while (opcao != 0);

    System.out.println("Relatório de veículos:");
    veiculo.printDados();

    double totalPrecos = veiculo.getPreco();

    if (veiculo instanceof Moto) {
        totalPrecos += veiculo.getPrecoComReajuste() - veiculo.getPreco();
    } else if (veiculo instanceof Carro) {
        totalPrecos -= veiculo.getPreco() * 0.08;
    }

    System.out.println("Total de preços: R$ " + totalPrecos);
}
}
