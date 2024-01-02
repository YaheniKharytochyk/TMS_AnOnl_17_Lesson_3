import java.util.Scanner;

public class Seasons_from_month_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Winter = "Зима";
        String Spring = "Весна";
        String Summer = "Лето";
        String Autumn = "Осень";
        String other = "Такого месяца не существует";
        String num = "Введите номер месяца";
        System.out.print(num);

        int MonthNum = scan.nextInt();
        switch (MonthNum) {
            case 12, 1,2 -> System.out.println(Winter);
            case 3, 4, 5 -> System.out.println(Spring);
            case 6, 7, 8 -> System.out.println(Summer);
            case 9, 10,11 -> System.out.println(Autumn);
            default -> System.out.println(other);

        }
    }
}