
public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

public class Mamifero extends Animal {
    private String pelagem;

    public Mamifero(String nome, int idade, String pelagem) {
        super(nome, idade);
        this.pelagem = pelagem;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }
}

public class Ave extends Animal {
    private String tipoVoo;

    public Ave(String nome, int idade, String tipoVoo) {
        super(nome, idade);
        this.tipoVoo = tipoVoo;
    }

    public String getTipoVoo() {
        return tipoVoo;
    }

    public void setTipoVoo(String tipoVoo) {
        this.tipoVoo = tipoVoo;
    }
}

public class TesteAnimais {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("Leão", 5, "Marrom");
        Ave ave = new Ave("Águia", 3, "Planado");

        System.out.println("Informações do Mamífero:");
        System.out.println("Nome: " + mamifero.getNome());
        System.out.println("Idade: " + mamifero.getIdade());
        System.out.println("Pelagem: " + mamifero.getPelagem());

        System.out.println("\nInformações da Ave:");
        System.out.println("Nome: " + ave.getNome());
        System.out.println("Idade: " + ave.getIdade());
        System.out.println("Tipo de Voo: " + ave.getTipoVoo());
    }
}
