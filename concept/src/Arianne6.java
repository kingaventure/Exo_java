public class Arianne6 extends Fusee {

    public Arianne6(String name, double poids) {
        super(name, poids);
    }

    public void lancer(String name) {
        System.out.println("La Fusée" + name + " est en phase de lancement");
        System.out.println("La Fusée" + name + " commence son lancement avec une poussée spécifique.");
    }

    public void separationEtage(String name) {
        System.out.println("Les étages de la fusée " + name + " se séparent après le lancement.");
    }
}
