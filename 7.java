class Student {
    String name;
    int rollNo;
    Student (String n, int r) {
        name = n;
        rollNo = r;
    System.out.println("Super class constructor called");
    }
    void display(){
        System.out.println("name:" + name);
        System.out.println("roll no: " + rollNo);
    }
}

class Result extends Student{
    int marks;
    Result(String n, int r, int m)
    {
        super(n,r);
        marks += m;
    System.out.println("Subclass constructor called");
    }
    void showResult(){
        display();
        System.out.println("marks: " + marks);
    }
    public static void main (String[] args)
    {
        Result obj = new Result("Isha", 27445, 85);
        obj.showResult();
    }
}