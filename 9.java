class Parent {
    public void show() {
        System.out.println("This is Parent class method");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("This is child class method (overridden)");
    }

    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");
        } 
        finally {
            System.out.println("Execution completed\n");
        }
    }
}

class Program9 {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.show();
        System.out.println();

        obj.divide(10, 2);
        obj.divide(20, 2);

        
        obj.divide(10, 0);
    }
}
