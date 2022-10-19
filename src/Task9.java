import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        boolean answer1 = isPrefix("automation", "auto-");
        System.out.println(answer1);

        boolean answer2 = isSuffix("arachnophobia", "-phobia");
        System.out.println(answer2);
    }

    public static boolean isPrefix(String str, String prefix) {
        if (prefix.charAt(prefix.length() - 1) != '-') {
            return false;
        }

        char[] prefix_char = prefix.toCharArray();
        char[] str_char = str.toCharArray();

        char[] cutted_prefix = Arrays.copyOf(prefix_char, prefix_char.length - 1);
        char[] cutted_str = Arrays.copyOf(str_char, cutted_prefix.length);

        return Arrays.equals(cutted_prefix, cutted_str);
    }

    public static boolean isSuffix(String str, String suffix) {
        if (suffix.charAt(0) != '-') {
            return false;
        }

        char[] suffix_char = suffix.toCharArray();
        char[] str_char = str.toCharArray();

        char[] cutted_suffix = Arrays.copyOfRange(suffix_char, 1, suffix_char.length);
        char[] cutted_str = Arrays.copyOfRange(str_char, str_char.length - cutted_suffix.length, str_char.length);

        return Arrays.equals(cutted_str, cutted_suffix);
    }
}
