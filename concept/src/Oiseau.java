public class Oiseau extends Animal {
    
    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace en volant.");
    }

    public void voler() {
        System.out.println("Je vole car je suis un oiseau.");
    }
    
}