import java.util.Scanner;

public class Cycles_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int Result = 0;
        for (int i = 1; number >= i; ++i) {
            Result += i;
        }
        System.out.println(Result);
    }
}
