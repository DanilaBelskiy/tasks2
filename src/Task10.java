public class Task10 {
    public static void main(String[] args) {
        int answer = boxSeq(8);
        System.out.println(answer);
    }

    public static int boxSeq(int inp) {
        int a = inp % 2;
        int b = inp / 2;

        return 0 + 2 * b + 3 * a;
    }
}
