public class Task6 {
    public static void main(String[] args) {
        int answer = Fibonacci(8);
        System.out.println(answer);
    }

    public static int Fibonacci(int number) {
        int n_1 = 0;
        int n_2 = 1;
        int helper = 0;

        if (number == 1){return 0;}
        if (number == 2){return 1;}

        for (int i = 0; i < number-2; i++) {
            helper = n_2;
            n_2 += n_1;
            n_1 = helper;
        }

        return n_2;
    }
}
