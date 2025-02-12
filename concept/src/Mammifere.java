public class Mammifere extends Animal {
    
    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace en marchant.");
    }

    public void marcher() {
        System.out.println("Je marche car je suis un mammifère.");
    }
    
}
