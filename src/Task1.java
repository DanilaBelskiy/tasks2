public class Task1 {
    public static void main(String[] args) {
        String answer = repeat("test", 5);
        System.out.println(answer);
    }

    public static String repeat(String str, int number) {
        char[] str_arr = str.toCharArray();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < number; j++) {
                answer += str_arr[i];
            }
        }
        return answer;
    }
}
