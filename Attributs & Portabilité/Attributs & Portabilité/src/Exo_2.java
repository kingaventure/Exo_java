public class Exo_2 {
    public static void main(String[] args) {
        Livre livre = new Livre();
        livre.titre = "Le Petit Prince";
        System.out.println("Titre du livre: " + livre.titre);
    }
}

class Livre {
    public String titre;
}