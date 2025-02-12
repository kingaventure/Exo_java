public class Voiture {
    private String modele;
    private String couleur;
    private double prix;

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = Math.max(prix, 0.01);
    }

    public void afficherDetails() {
        System.out.println("Modèle: " + modele);
        System.out.println("Couleur: " + couleur);
        System.out.println("Prix: " + prix);
    }
}
