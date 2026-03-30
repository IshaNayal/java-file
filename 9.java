class Parent{
    public void show(){
        System.out.print("This is Parent class method");
    }
}
class Child extends Parent{
    public void show(){
        System.out.print("This is child class method (overridden)");
    }
    public void divide(int a, int b){
        try{
            int result =a/b;
            System.out.print("Result:" + result);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught:(cannot divide by zero)");
        } 
        finally{
            System.out.println("Execution completed");
        }
    }
}
class Program9 {
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.show();
        obj.divide(10,2);
        obj.divide(20,2);
    }
}