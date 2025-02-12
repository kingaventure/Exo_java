public class Arianne6Lancement {
    public static void main(String[] args) {
        String name = "Arianne6";
        double poids = 500000.0;
        Arianne6 arianne6 = new Arianne6(name, poids);
        arianne6.lancer(name);
        arianne6.separationEtage(name);
        
    }
    
}