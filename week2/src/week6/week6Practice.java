package week6;

public class week6Practice {

    static class Student {

        String name;
        int attendance;

        static String collegeName = "SRM Institute of Science and Technology";
        static int studentCount = 0;

        // Constructor
        Student(String name, int attendance) {
            this.name = name;
            this.attendance = attendance;
            studentCount++;
        }

        // Static method
        static void printCollegeInfo() {
            System.out.println(collegeName);
            System.out.println("Students created: " + studentCount);
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Ravi", 85);
        Student s2 = new Student("Arjun", 90);

        Student.printCollegeInfo();
    }
}