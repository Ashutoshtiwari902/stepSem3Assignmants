package week6;

public class week6Practice {
    static class Course {

        String code;
        String title;
        int credits;
        int labCredits;

        // Constructor with lab credits
        public Course(String code, String title, int credits, int labCredits) {

            this.code = code;
            this.title = title;
            this.credits = credits;
            this.labCredits = labCredits;
        }

        // Constructor for theory-only course
        public Course(String code, String title, int credits) {

            this(code, title, credits, 0);
        }

        // Method to calculate total credits
        public int totalCredits() {

            return credits + labCredits;
        }
    }

    public static void main(String[] args) {

        Course c1 = new Course("21CSC201", "Data Structures", 4);

        Course c2 = new Course("21CSC265L", "DSA Lab", 3, 1);

        System.out.println(c1.code + " total credits: " + c1.totalCredits());

        System.out.println(c2.code + " total credits: " + c2.totalCredits());
    }
}