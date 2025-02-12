public class Exo_1 {
    public static void main(String[] args) throws Exception {
        Mammifere mammifere = new Mammifere();
        Oiseau oiseau = new Oiseau();
        Reptile reptile = new Reptile();
        System.out.println("Exercice 1 :");
        System.out.println("");
        System.out.println("Mammifère :");
        mammifere.seDeplacer();
        mammifere.marcher();
        System.out.println("");
        System.out.println("Oiseau :");
        oiseau.seDeplacer();
        oiseau.voler();
        System.out.println("");
        System.out.println("Reptile :");
        reptile.seDeplacer();
        reptile.ramper();
    }
}
