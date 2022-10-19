public class Task5 {
    public static void main(String[] args) {
        int answer = getDecimalPlaces("12.311");
        System.out.println(answer);
    }

    public static int getDecimalPlaces(String str) {
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                answer = str.length() - (i + 1);
            }
        }

        return answer;
    }
}
