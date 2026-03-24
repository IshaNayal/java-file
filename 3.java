class student{
    int rollNo;
    String name;

    student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    student(){
        this(101,"ABC");
        System.out.println("default constructor executed");
}
    void display(){
        this.show();
    }

    void show(){
        System.out.println("Roll No:" + rollNo);
        System.out.println("Name" + name);
    }

    void passObject(){
        recieve(this);
    }

    void recieve(student s){
        System.out.println("Object recieved successfully");
    }
    
    student getObject(){
        return this;
    }
}
class Test{
    public static void main(String[] args){
        student s1 = new student();
        s1.display();
        s1.passObject();

        student s2 = s1.getObject();
        System.out.println("Returned Object Name:" + s2.name);
    }
}