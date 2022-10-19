public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{44, 32, 86, 19};
        int answer = differenceMaxMin(arr);
        System.out.println(answer);
    }

    public static int differenceMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }
}
