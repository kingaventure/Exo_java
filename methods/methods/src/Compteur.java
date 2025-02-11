public class Compteur {
    static int point = 0;
    public static int incrementer(int valeur){
        return point = valeur + point;
      }

      public static void afficherCompteur(){
        System.out.println(point);
      }
}
