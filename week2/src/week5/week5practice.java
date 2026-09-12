package week5;
import java.util.*;

import static week5.week5practice.Candidate.isEligible;

public class week5practice {
    static class Candidate {

        private String name;
        private double cgpa;
        private int codingScore;

        // Constructor
        public Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        // Rule 1: CGPA only
        static boolean isEligible(double cgpa) {
            return cgpa >= 7.5;
        }

        // Rule 2: CGPA + coding score
        static boolean isEligible(double cgpa, int codingScore) {
            return cgpa >= 6.5 && codingScore >= 60;
        }

        // Sort by coding score - highest first
        public int compareTo(Candidate other) {
            return Integer.compare(other.codingScore, this.codingScore);
        }
    }

    static String shortlistAndRank(Candidate[] candidates) {

        Candidate[] shortlist = new Candidate[candidates.length];

        int count = 0;

        for (int i = 0; i < candidates.length; i++) {

            boolean eligible;

            if (candidates[i].cgpa >= 7.5) {
                eligible = isEligible(candidates[i].cgpa);
            }
            else {
                eligible = isEligible(
                        candidates[i].cgpa,
                        candidates[i].codingScore
                );
            }

            if (eligible) {
                shortlist[count] = candidates[i];
                count++;
            }
        }

        // Sort shortlisted candidates
        Arrays.sort(shortlist, 0, count,
                (a, b) -> b.codingScore - a.codingScore
        );

        String result = "";

        for (int i = 0; i < count; i++) {

            result = result
                    + (i + 1)
                    + ". "
                    + shortlist[i].name
                    + " ("
                    + shortlist[i].codingScore
                    + ".0)";

            if (i < count - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Candidate[] candidates = {
                new Candidate("Aisha", 8.2, 40),
                new Candidate("Rohit", 6.8, 65),
                new Candidate("Meena", 6.0, 90),
                new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}