class Exo_10 {   

    public static void main(String[] args) {
        
        int my42Int = 42;
        double my42Double = 42.0;
        boolean my42Boolean = true;
        char my42Char = 'q';
        String my42String = "quarante-deux";
        float my42Float = 42.0f;
        long my42Long = 42L;
        byte my42Byte = 42;
        short my42Short = 42;


        System.out.println("Type of my42Int: " + ((Object) my42Int).getClass().getSimpleName());
        System.out.println("Type of my42Double: " + ((Object) my42Double).getClass().getSimpleName());
        System.out.println("Type of my42Boolean: " + ((Object) my42Boolean).getClass().getSimpleName());
        System.out.println("Type of my42Char: " + ((Object) my42Char).getClass().getSimpleName());
        System.out.println("Type of my42String: " + ((Object) my42String).getClass().getSimpleName());
        System.out.println("Type of my42Float: " + ((Object) my42Float).getClass().getSimpleName());
        System.out.println("Type of my42Long: " + ((Object) my42Long).getClass().getSimpleName());
        System.out.println("Type of my42Byte: " + ((Object) my42Byte).getClass().getSimpleName());
        System.out.println("Type of my42Short: " + ((Object) my42Short).getClass().getSimpleName());
    }
}