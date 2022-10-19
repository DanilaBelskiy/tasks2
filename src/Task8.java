public class Task8 {
    public static void main(String[] args) {
        boolean answer = isStrangePair("341", "123");
        System.out.println(answer);
    }

    // Return true if start of first string = end of second string
    // And start of second string = end of first string
    // Else return false
    public static boolean isStrangePair(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        return (arr1[0] == arr2[arr2.length-1]) & (arr2[0] == arr1[arr1.length-1]);
    }
}
