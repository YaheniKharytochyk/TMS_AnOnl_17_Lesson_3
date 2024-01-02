public class Aditional_tasks_Fibonachi {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i <=11; i++) {
            num1 = num2-num1;
            num2 = num1+num2;
            System.out.println(num1);
        }
    }
}
