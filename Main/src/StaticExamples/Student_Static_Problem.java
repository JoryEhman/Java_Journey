package StaticExamples;

import java.util.Calendar;

class Student {
    private String rollNum;
    private static int uniNum = 1;
    Calendar c = Calendar.getInstance();

    Student(){
        rollNum = generateRollNum();
    }

    public String getRollNum(){
        return rollNum;
    }

    private String generateRollNum(){
        rollNum = "Univ-"+ c.get(Calendar.YEAR) + "-" + uniNum;
        uniNum++;
        return rollNum;
    }
}

public class Student_Static_Problem {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Student s1's rollNum: " + s1.getRollNum());
        Student s2 = new Student();
        System.out.println("Student s2's rollNum: " + s2.getRollNum());
    }
}
