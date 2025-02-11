public class Personne {
    private String nom;
    private int age;
    private String adresse;

    public Personne(String nom, int age, String adresse) {
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }

    public void afficherNom() {
        System.out.println("Nom: " + this.nom);
    }

    private void changerNom(String nom) {
        this.nom = nom;
    }

    protected void afficherAge() {
        System.out.println("Age: " + this.age);
    }

    void afficherAdresse() {
        System.out.println("Adresse: " + this.adresse);
    }
}
