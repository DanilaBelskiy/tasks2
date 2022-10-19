public class Task10 {
    public static void main(String[] args) {
        int answer = boxSeq(8);
        System.out.println(answer);
    }

    // Algorithm:
    // Start with 0
    // 1) Add 3
    // 2) Sub 1
    // Repeat 1) and 2)

    // Return number after n steps
    public static int boxSeq(int inp) {
        int a = inp % 2;
        int b = inp / 2;

        return 0 + 2 * b + 3 * a;
    }
}
