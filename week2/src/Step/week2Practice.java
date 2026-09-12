package Step;

public class week2Practice {
    static String normalizeReference(String raw) {

        raw = raw.trim();

        String first3 = raw.substring(0, 3).toUpperCase();

        String rest = raw.substring(3);

        return first3 + rest;
    }

    static String validateAndFormat(String reference) {

        // Check length
        if (reference.length() != 14) {
            return "Invalid — wrong length";
        }

        // Check first 3 characters are letters
        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid — non-letter bank code";
            }
        }

        // Check remaining 11 characters are digits
        for (int i = 3; i < 14; i++) {

            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid — non-digit body";
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append("[");
        sb.append(reference.substring(0, 3));
        sb.append("] DATE: ");
        sb.append(reference.substring(3, 9));
        sb.append(" | SEQ: ");
        sb.append(reference.substring(9, 14));

        return sb.toString();
    }

    public static void main(String[] args) {

        String raw = " pay2026091234567 ";

        String reference = normalizeReference(raw);

        System.out.println(validateAndFormat(reference));
    }
}