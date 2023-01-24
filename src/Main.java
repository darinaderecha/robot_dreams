import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String instruction = "введіть число і натисніть Enter";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Якщо хочете знайти більше з двох чисел - натисніть 1 і Enter");
        System.out.println("Якщо хочете знайти менше з двох чисел - натисніть 2 і Enter");
        System.out.println("Якщо хочете перевірити чи парне число - натисніть 3 і Enter");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Для знаходження найбільшого числа " + instruction);
                int max = scanner.nextInt();
                System.out.println(instruction);
                int min = scanner.nextInt();

                if (min > max) {
                    max = min;
                }
                System.out.println("Найільше число : " + max);
            }
            case 2 -> {
                System.out.println("Для знаходження найменшого числа " + instruction);
                int max = scanner.nextInt();
                System.out.println(instruction);
                int min = scanner.nextInt();
                if (min > max) {
                    min = max;
                }
                System.out.println("Найменше число : " + min);
            }
            case 3 -> {
                System.out.println("Для перевірки числа на парність " + instruction);
                int oddOrEven = scanner.nextInt();
                if (oddOrEven % 2 == 0) {
                    System.out.println("Парне");
                } else {
                    System.out.println("Непарне");
                }
            }
            default -> System.out.println("Перевірте, чи обрали ви щось з існуючих опцій");

        }


    }
}
