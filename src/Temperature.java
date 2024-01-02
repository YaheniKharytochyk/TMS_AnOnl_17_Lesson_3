import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hot = "На улице тепло";
        String normal = "На улице хорошо";
        String cold = "На улице холодно";
        System.out.println("Сколько градусов на улице ?");
        int temp = scan.nextInt();
        if (temp > -5){
            System.out.println(hot);
        } else if (temp <= -5 && temp > -20 ){
            System.out.println(normal);
        } else {
        } System.out.println(cold);


    }
}