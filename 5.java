class Person {
    String name;
void getName (String n) {
    name = n;
}
}
class Student extends Person{
    int roll;
void getRoll (int r){
    roll = r;
}
}

interface Sports {
    int sportsMarks = 25;
}

interface Academics {
    int academicMarks = 75;
}

class Result extends Student implements Sports, Academics{
    void display() {
        System.out.println("Name:" + name);
        System.out.println("Roll no:" + roll);
        System.out.println("sports Marks:" + sportsMarks);
        System.out.println("Academics marks:" + academicMarks);
        System.out.println("Total marks:" + (sportsMarks +academicMarks));
    }
}

class HybridInheritanceDemo{
    public static void main (String [] args) {
        Result r = new Result();
        r.getName("Isha");
        r.getRoll(27445);
        r.display();
    }
}