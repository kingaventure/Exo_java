public class Exo_3 {
    public static void main(String[] args) {
        Dog red = new Dog();

        System.out.println(red.getName());
    }
}

class Animal {
    protected String name = "je suis protected";
}

class Dog extends Animal {
    public String getName() {
        return name;
    }
}
