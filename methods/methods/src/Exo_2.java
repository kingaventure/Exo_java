public class Exo_2 {
    public static void main(String[] args) {
        Personne personne = new Personne("John", "24 Rue Jeanne d'Arc", 25);

        personne.afficherNom();
        personne.afficherAddresse();
    }
}


class Personne {
public String nom;
public String adresse;
public int age;

public Personne(String nom, String adresse, int age) {
    this.nom = nom;
    this.adresse = adresse;
    this.age = age;
}

public Void afficherNom () {
    System.out.println(nom);
    return null;
}

private void changerNom (String nom) {
    this.nom = nom;
}

protected void afficherAge () {
    System.out.println(age);
}

void afficherAddresse () {
    System.out.println(adresse);
}


}
