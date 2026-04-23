package section14_oop;

public class Student {
    private int rollNumber;
    private String name;
    private String course;
    private int score1, score2, score3;

    public int total(){
        return score1 + score2 + score3;
    }

    public double average(){
        return (double) (score1 + score2 + score3) / 300;
    }

    public String grade(double average){
        average = average * 100;
        if (average >= 90.00){
            return "A";
        }
        else if (average <= 80.00){
            return "B";
        }
        else if (average <= 70.00){
            return "C";
        }
        else if (average <= 60.00){
            return "D";
        }
        else {
            return "F";
        }
    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Jory Ehman";
        s1.rollNumber = 6;
        s1.course = "Compilers";
        s1.score1 = 99;
        s1.score2 = 95;
        s1.score3 = 90;

        System.out.println("Student: " + s1.name);
        System.out.println("Has the roll number: " + s1.rollNumber);
        System.out.println("Class: " + s1.course);
        System.out.println("Got scores of Test 1: " + s1.score1 + ", Test2: " + s1.score2 + ", Test 3: " + s1.score3);
        double avg = s1.average();
        System.out.println("For an average of " + s1.grade(avg));
    }
}
