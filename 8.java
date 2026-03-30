class Parent{
    Parent(){
        System.out.println("Parent constructor");
    }
}

class child extends Parent{
    static{
        System.out.println("Static block executed");
    }
    
    child(){
        super();
        System.out.println("Default constructor");
    }
    
    child(int x){
        super();
        System.out.println("Parameterized constructor" + x);
    }
    
    void display(){
        System.out.println("Display method with no parameter");
    }
    
    void display(int a){
        System.out.println("Display method with one parameter" + a);
    }
    
    static void show(){
        System.out.println("static method called");
    }
}

class Main{
    public static void main(String[] args){
        child obj = new child();
        obj.display();
        obj.display(5);
        child.show();
    }
}