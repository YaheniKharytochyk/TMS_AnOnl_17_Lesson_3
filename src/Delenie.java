import java.util.Scanner;

public class Delenie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "Введите число";
        String even = "Четнео число";
        String uneven = "Нечетное число";
        System.out.println(input);
        while (scan.hasNext()) {
            int number = scan.nextInt();
            int result = number % 2;
            if (result == 0) {
                System.out.println(even);
            } else {
                System.out.println(uneven);
            }
        }
    }
}

