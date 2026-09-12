package week6;

public class week6Assignment {

    static class HallTicket {

        String studentName;
        int seatNumber;

        // Constructor
        HallTicket(String studentName, int seatNumber) {
            this.studentName = studentName;
            this.seatNumber = seatNumber;
        }
    }

    public static void main(String[] args) {

        HallTicket priya = new HallTicket("Priya", 20);

        // Second variable points to the SAME object
        HallTicket copy = priya;

        // Change through second variable
        copy.seatNumber = 45;

        System.out.println("Priya's seatNumber (via first variable):");
        System.out.println(priya.seatNumber);

        System.out.println("copy == priya: " + (copy == priya));

        // Create a separate object with same values
        HallTicket separate = new HallTicket("Priya", 45);

        System.out.println("separate == priya: " + (separate == priya));
    }
}