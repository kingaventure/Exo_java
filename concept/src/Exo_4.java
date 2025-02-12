public class Exo_4 {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(5);
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("Surface du cercle: " + cercle.calculerSurface());
        System.out.println("Surface du rectangle: " + rectangle.calculerSurface());
    }
    
}
