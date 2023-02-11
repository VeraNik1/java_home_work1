import java.util.Scanner;
/*Вывести все простые числа от 1 до 1000 */

public class task02 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Введите натуральное число больше 1 ");
                Scanner inter = new Scanner(System.in);
                int number = inter.nextInt();
                if (number > 2) {
                    System.out.printf("Простые числа от 1 до %d >>> 2 ", number); // число 1 не является ни простым, ни составным
                    for (int i = 3; i <= number; i += 2) {
                        if (checkPrimeNumber(i)) {
                            System.out.printf("%d ", i);
                        }
                    }
                    break;
                } else if (number == 2) {
                    System.out.printf("Простые числа от 1 до %d >>> 2 ", number);
                    
                    break;
                }

                else {
                    System.out.println("Введено число меньше 1, попробуйте еще раз!");
                }
            }

            catch (Exception e) {
                System.out.println("введено не натуральное число, попробуйте еще раз!");
            }

        }
    }
    // проверка является ли число простым
    static boolean checkPrimeNumber(int num) {
        if (1 < num && num <= 3) {
            return true;
        } else {
            for (int i = 2; i <= num / 2 + 1; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

        }
        return true;
    }

}
