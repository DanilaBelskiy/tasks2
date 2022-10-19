public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3};
        int[] answer = cumulativeSum(arr);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            System.out.print(" ");
        }
    }

    public static int[] cumulativeSum(int[] arr) {
        int sum_helper = 0;
        int[] new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i] + sum_helper;
            sum_helper += arr[i];
        }
        return new_arr;
    }
}
