public class Task7 {
    public static void main(String[] args) {
        boolean answer = isValid("12312");
        System.out.println(answer);
    }

    // Return true if input string is postcode
    // Else return false
    public static boolean isValid(String inp) {
        if (inp.length() > 5) {
            return false;
        }

        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                return false;
            }
        }

        String digits = "1234567890";

        for (int i = 0; i < inp.length(); i++) {
            boolean is_digit = false;
            for (int j = 0; j < digits.length(); j++){
                if (inp.charAt(i) == digits.charAt(j)) {
                    is_digit = true;
                }
            }
            if (!is_digit) {
                return false;
            }
        }

        return true;
    }
}
