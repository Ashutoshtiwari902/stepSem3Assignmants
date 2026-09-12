package week6;

public class week6Practice {

    static class IdCard {

        String name;
        int booksIssued;

        // Constructor
        IdCard(String name, int booksIssued) {
            this.name = name;
            this.booksIssued = booksIssued;
        }
    }

    public static void main(String[] args) {

        IdCard ravi = new IdCard("Ravi", 0);

        // duplicate points to the same object
        IdCard duplicate = ravi;

        // Change through duplicate
        duplicate.booksIssued = 3;

        System.out.println("Ravi's booksIssued (via first variable): "
                + ravi.booksIssued);

        System.out.println("duplicate == ravi: " + (duplicate == ravi));

        // Create a separate object
        IdCard separate = new IdCard("Ravi", 3);

        System.out.println("separate == ravi: " + (separate == ravi));
    }
}