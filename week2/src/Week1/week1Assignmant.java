package Week1;

public class week1Assignmant {
    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        // Calculate totals
        for (int i = 0; i < sectionA.length; i++) {
            totalA = totalA + sectionA[i];
            totalB = totalB + sectionB[i];
        }

        // Check balance
        if (totalA == totalB) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        // Find highest
        int highest = sectionA[0];
        int index = 0;
        String section = "Section A";

        for (int i = 0; i < sectionA.length; i++) {

            if (sectionA[i] > highest) {
                highest = sectionA[i];
                index = i;
                section = "Section A";
            }

            if (sectionB[i] > highest) {
                highest = sectionB[i];
                index = i;
                section = "Section B";
            }
        }

        System.out.println(
                "Highest Quantity: " + highest +
                        " (" + section + ", Item " + (index + 1) + ")"
        );
    }

    public static void main(String[] args) {

        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        analyzeInventory(sectionA, sectionB);
    }
}