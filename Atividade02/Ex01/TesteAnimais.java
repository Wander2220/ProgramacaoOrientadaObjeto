public class TesteAnimais {
    public static void main(String[] args) {
     
        Peixe peixe = new Peixe("Nemo", 0.5, "Água Doce");
        Cachorro cachorro = new Cachorro("Rex", 15.0, "Labrador");

        System.out.println("Informações do Peixe:");
        System.out.println(peixe.toString());

        System.out.println("\nInformações do Cachorro:");
        System.out.println(cachorro.toString());
    }
}
