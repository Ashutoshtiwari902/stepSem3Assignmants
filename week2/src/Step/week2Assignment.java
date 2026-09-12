package Step;
public class week2Assignment {
    static String normalizeCode(String raw) {

        raw = raw.trim();

        String first3 = raw.substring(0, 3).toUpperCase();
        String rest = raw.substring(3);

        return first3 + rest;
    }

    static String validateAndFormat(String code) {

        // Check length
        if (code.length() != 13) {
            return "Invalid — wrong length";
        }

        // Check first 3 characters are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid — non-letter publisher code";
            }
        }

        // Check remaining 10 characters are digits
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid — non-digit body";
            }
        }

        // Build formatted output
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        sb.append(code.substring(0, 3));
        sb.append("] YEAR: ");
        sb.append(code.substring(3, 7));
        sb.append(" | CATALOG: ");
        sb.append(code.substring(7, 13));

        return sb.toString();
    }

    public static void main(String[] args) {

        String raw = " pen2026004251 ";

        String code = normalizeCode(raw);

        System.out.println(validateAndFormat(code));
    }
}