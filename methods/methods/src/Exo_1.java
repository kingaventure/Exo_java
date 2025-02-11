public class Exo_1 {
    public static void main(String[] args) {
        Addition addition = new Addition(5, 10);
        int resultat = addition.calculerSomme();
        System.out.println("La somme est : " + resultat);
    }
}
