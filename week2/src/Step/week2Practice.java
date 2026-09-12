package Step;

public class week2Practice {
    static void formatPhone(String phone) {

        if (phone.length() != 10) {
            System.out.println("Invalid phone number");
            return;
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                System.out.println("Invalid phone number");
                return;
            }
        }

        String lastFour = phone.substring(6);

        StringBuilder sb = new StringBuilder();

        sb.append("XXXXXX");
        sb.append("-");
        sb.append(lastFour);

        System.out.println(sb);
    }

    public static void main(String[] args) {

        formatPhone("9876543210");
        formatPhone("98765abc10");
        formatPhone("987654");
    }
}