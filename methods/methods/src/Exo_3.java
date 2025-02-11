public class Exo_3 {
    static double a = 1;
    static double b = 49;
    static String operation = "add";
 
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
         
        double result = calculator.effectuerOperation(operation, a, b);
        System.out.println(result == 50 ? "You found a big secret" : result);
    }
    
 }
