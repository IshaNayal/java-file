class Parent{
    Parent(){
        system.out.println("Parent Constructor");
    }
}
class chiild extends Parent{
    static{
        System.out.println("Static block executed");
    }
    void(){
        this(10);
        System.out.println("Default constructor");
    }

    child(int x){
        System,out.println("parameterized constructor", x);
    }
    void display(){
        System.out.println("Display method with no parameter");
    }
    void display(int x){
        System.out.println("Display method with parameter" + a);
        System.out.println("marks:" + marks );
    }
    public static void main(String[] args)
    {
        Result obj = new Result("")
    }
}