import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму вашего вклада");
        float money = scan.nextFloat();
        System.out.println("Сколько месяцев вашой суммой будет пользоваться банк ?");
        int month = scan.nextInt();
        for (int i =1; i <=month; ++i){
            money *= 1.07F;
            System.out.println("Сумма вашего вклада после этих месяцев " + money);
        }

    }
}
