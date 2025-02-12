public class Fusee {
    protected  String name;
    protected  double poids;

    public Fusee(String name, double poids) {
        this.name = name;
        this.poids = poids;
        System.out.println("Fusée " + name + " crée, poids : " + poids + " kg.");
    }

    public void lancer(String name, double poids) {
        
    }

    public String getNom() {
        return name;
    }

    public void setNom(String name) {
        this.name = name;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }
}