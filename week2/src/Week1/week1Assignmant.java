package Week1;

public class week1Assignmant {
    static void findLongestStreak(String signalLog) {

        char longestColor = signalLog.charAt(0);

        int currentCount = 1;
        int longestCount = 1;

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentCount++;
            }
            else {
                currentCount = 1;
            }

            if (currentCount > longestCount) {
                longestCount = currentCount;
                longestColor = signalLog.charAt(i);
            }
        }

        System.out.println(
                "Longest Streak: '" + longestColor +
                        "' repeated " + longestCount + " times"
        );
    }

    public static void main(String[] args) {

        findLongestStreak("RRGGGYRR");
    }
}