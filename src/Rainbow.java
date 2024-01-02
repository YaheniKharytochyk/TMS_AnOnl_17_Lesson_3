import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Введите номер цвета радуги от 1-7");
        int number =scan.nextInt();
        switch (number) {
            case 1 -> System.out.println("Красный");
            case 2 -> System.out.println("Оранжевый");
            case 3 -> System.out.println("Желтый");
            case 4 -> System.out.println("Зеленый");
            case 5 -> System.out.println("Голубой");
            case 6 -> System.out.println("Синий");
            case 7 -> System.out.println("Фиолетовый");
            default -> System.out.println("В радуге нет номера такого цвета, написали же вам от 1 до 7");
        }
    }
}
