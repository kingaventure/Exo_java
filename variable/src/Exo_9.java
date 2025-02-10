class Exo_9 {   

    public static void main(String[] args) {
        
        int rand = (int) (Math.random() * 42) + 1;
        
        boolean isFortyTwo = (rand == 42);
        
        System.out.println("Random number: " + rand);
        System.out.println("Is the number 42? " + isFortyTwo);
    }
}