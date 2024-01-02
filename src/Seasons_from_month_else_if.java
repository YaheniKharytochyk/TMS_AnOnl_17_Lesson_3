import java.util.Scanner;

public class Seasons_from_month_else_if {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Winter = "Зима";
        String Spring = "Весна";
        String Summer = "Лето";
        String Autumn = "Осень";
        String other = "Такого месяца не существует";
        String num = "Введите номер месяца";
        System.out.print(num);
        int Month = scan.nextInt();
        if (Month <= 2 && Month != 0 || Month == 12) {
            System.out.println(Winter);
        } else if (Month > 2 && Month <= 5) {
            System.out.println(Spring);
        } else if (Month > 5 && Month <= 8) {
            System.out.println(Summer);
        } else if (Month > 8 && Month <= 11) {
            System.out.println(Autumn);
        } else {
            System.out.println(other);


        }

    }
}

