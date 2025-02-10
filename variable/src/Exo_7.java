class Exo_7 {   

    public static void main(String[] args) {
        String my42count = null;
        String result = ("" + my42count).replace("null", "42");
        System.out.println(result);

        char[] myArray42 = {'q', 'u', 'a', 'r', 'a', 'n', 't', 'e', '-', 'd', 'e', 'u', 'x'};
        
        
        int myArray42Len = myArray42.length;
        
        System.out.println("\nLength of myArray42: " + myArray42Len);
    }
}