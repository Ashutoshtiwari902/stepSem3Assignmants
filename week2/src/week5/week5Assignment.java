package week5;
import java.util.*;

import static week5.week5Assignment.Player.isDraftable;

public class week5Assignment {
    static class Player implements Comparable<Player> {

        private String name;
        private int matchesPlayed;
        private double battingAverage;
        private boolean injured;

        public Player(String name, int matchesPlayed,
                      double battingAverage, boolean injured) {

            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        // Established player rule
        static boolean isDraftable(int matchesPlayed) {

            return matchesPlayed >= 10;
        }

        // New player rule
        static boolean isDraftable(int matchesPlayed, boolean injured) {

            return matchesPlayed >= 5 && !injured;
        }

        // Sort by batting average - highest first
        @Override
        public int compareTo(Player other) {

            return Double.compare(other.battingAverage,
                    this.battingAverage);
        }
    }

    static String draftAndRank(Player[] players) {

        Player[] draftable = new Player[players.length];

        int count = 0;

        for (int i = 0; i < players.length; i++) {

            boolean eligible;

            if (players[i].matchesPlayed >= 10) {
                eligible = isDraftable(players[i].matchesPlayed);
            }
            else {
                eligible = isDraftable(
                        players[i].matchesPlayed,
                        players[i].injured
                );
            }

            if (eligible) {
                draftable[count] = players[i];
                count++;
            }
        }

        // Sort using compareTo()
        Arrays.sort(draftable, 0, count);

        String result = "";

        for (int i = 0; i < count; i++) {

            result = result
                    + (i + 1)
                    + ". "
                    + draftable[i].name;

            if (i < count - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Player[] players = {
                new Player("Virat", 15, 48.0, false),
                new Player("Rahul", 7, 55.0, false),
                new Player("Sameer", 3, 60.0, false),
                new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}