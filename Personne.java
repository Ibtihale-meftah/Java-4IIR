package treeset;

public class Personne {
    private String nom;
    public int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public String toString() {
        return nom + " (" + age + " ans)";
    }
}

