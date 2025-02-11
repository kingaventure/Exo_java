public class Exo_3 {
    public static void main(String[] args) {
        Chien chien = new Chien();
        chien.setNom("Rex");
        System.out.println("Nom du chien: " + chien.getNom());
    }
}

class Animal {
    protected String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

class Chien extends Animal {
    
}
