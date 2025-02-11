public class Exo_5 {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Toyota");
        System.out.println("Marque de la voiture: " + voiture.getMarque());
    }
}

class Voiture {
    private String marque;

    public Voiture(String marque) {
        this.marque = marque;
    }

    public String getMarque() {
        return marque;
    }
}
