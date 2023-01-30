package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String instruction = "введіть число і натисніть Enter";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Якщо хочете вивести числа від 1 до 10 - натисніть 1 і Enter");
        System.out.println("Якщо хочете знайти знайти всі парні числа від 1 до 100 - натисніть 2 і Enter");
        System.out.println("Якщо хочете знайти факторіал числа - натисніть 3 і Enter");
        System.out.println("Якщо хочете вивести числа Фібоначчі - натисніть 4 і Enter");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Для знаходження чисел від 1 до 10 " + instruction);
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i + " ");
                }
            }
            case 2 -> {
                System.out.println("Для знаходження парних чисел від 1 до 100 " + instruction);
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }

                }
            }
            case 3 -> {
                int x = 7;
                int factorial  = 1;
                System.out.print("Це факторіал числа 7 : ");
                do {
                    for (int i = 1; i <= x; i++) {
                        factorial *= i;

                    }
                    System.out.println(factorial);

                    System.out.println("Для того щоб знайти факторіал іншого числа - " + instruction);
                    System.out.println("Для того щоб вийти з програми  - введіть -1 ");
                    x = scanner.nextInt();
                    factorial = 1;

                } while (x != -1);

            }
            case 4 -> {
                int x = 100;
                System.out.println("Це числа фібоначчі до 100 : ");
                do {
                    int fibonacci = 0 ;
                    int add1= 0;
                    int add2=1;
                    while (fibonacci + add1 < x){
                        fibonacci = add1 + add2;
                        add1 = add2;
                        add2 = fibonacci;

                        System.out.print(fibonacci + " ");

                    }

                    System.out.println("\n" + "Для того щоб вивести числа Фібоначчі до іншого числа " + instruction);
                    System.out.println("Для того щоб вийти з програми  - введіть -1 ");
                    x = scanner.nextInt();



                }while (x != -1);
            }
            default -> System.out.println("Перевірте, чи обрали ви щось з існуючих опцій");

        }

    }



}
