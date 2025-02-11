public class Exo_1 {
    public static void main(String[] args) {
        Livre livre = new Livre();
        livre.setTitre("Le Petit Prince");
        System.out.println("Titre du livre: " + livre.getTitre());
    }
}

class Livre {
    private String titre;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
