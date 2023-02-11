import java.util.Scanner;

/*Вычислить n-ое треугольное число
(сумма чисел от 1 до n), n! 
(произведение чисел от 1 до n) */

public class task01 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Введите натуральное число");
                Scanner inter = new Scanner(System.in);
                int number = inter.nextInt();
                if (number > 0) {
                    System.out.printf("Для числа %d треугольное число равно %d\n", number, triangleNum(number));
                    System.out.printf("Для числа %d факториал равен ", number);
                    System.out.printf("%.0f", factorial(number));
                    break;
                } else {
                    System.out.println("Введено число <= 0, попробуйте еще раз!");
                }
            } catch (Exception e) {
                System.out.println("введено не натуральное число, попробуйте еще раз!");
            }
        }

    }

    static int triangleNum(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return num + triangleNum(num - 1);
    }

    static double factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

}
