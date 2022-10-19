public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 2, 2, 5};
        boolean answer = isAvgWhole(arr);
        System.out.println(answer);
    }

    public static boolean isAvgWhole(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double sum_d = sum;
        double avg = sum_d / arr.length;

        return Math.round(avg) == avg;
    }
}
