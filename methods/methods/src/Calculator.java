class Calculator {

    

    public double effectuerOperation(String operation, double a, double b) {
        switch (operation) {
            case "add":
                return add(a, b);
            case "sous":
                return sous(a, b);
            case "divid":
                return divid(a, b);
            case "multi":
                return multi(a, b);
            default:
                return 0;
        }
    }

    public int add (int a, int b){
        return a + b;
    }

    public double add (double a, double b){
        return a + b;
    }
    
    public int sous(int a, int b){
        return a - b;
    }

    public double sous(double a, double b){
        return a - b;
    }

    public int divid(int a, int b){
        return a / b;
    }

    public double divid(double a, double b){
        return a / b;
    }

    public int multi(int a, int b){
        return a * b;
    }

    public double multi(double a, double b){
        return a * b;
    }
    
}