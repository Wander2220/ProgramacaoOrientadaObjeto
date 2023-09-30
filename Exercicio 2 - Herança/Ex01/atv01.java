// Classe Animal
public class Animal {
    private String nome;
    private double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal [Nome: " + nome + ", Peso: " + peso + "]";
    }
}

public class Peixe extends Animal {
    private String tipoHabitat;

    public Peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de Habitat: " + tipoHabitat;
    }
}

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + ", Raça: " + raca;
    }
}
