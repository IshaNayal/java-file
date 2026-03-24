class StudentApp
{
    static String collegeName = "DCE";
    int rollno;
    Integer marks;

    static void showCollege(){
        System.out.println("College: "+ collegeName);
    }
    void showStudent() {
        System.out.println("Rollno: "  + rollno);
        System.out.println("marks: " + marks);
    }

    static class Grade{
        static void calculateGrade(Integer marks)
        {
            if (marks >= 75)
             System.out.println("Grade A");
            else if (marks >= 60)
             System.out.println("Grade B");
            else
             System.out.println("Grade C");
        }
    }
    public static void main(String[] args) {
        Integer marks = Integer.valueOf(82);
        StudentApp s1 = new StudentApp();

        s1.rollno = 101;
        s1.marks = marks;

        s1.showStudent();
        StudentApp.showCollege();
        StudentApp.Grade.calculateGrade(marks);
    }
}