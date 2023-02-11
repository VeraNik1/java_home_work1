/* Вывести все простые числа от 1 до 1000 */

public class task02 {
    public static void main(String[] args) {
       int number = 1000;
       System.out.printf("Простые числа от 1 до %d >>> 2 ", number); // число 1 не является ни простым, ни составным
       for(int i = 3; i <= number; i += 2) 
          {if (checkPrimeNumber(i)) {
              System.out.printf("%d ", i);
          }
                        }}

    // проверка является ли число простым
    static boolean checkPrimeNumber(int num) {
        if (1 < num && num <= 3) {
            return true;
        } else {
            for (int i = 2; i <= num / 2 + 1; i++) {
                if (num % i == 0) {
                    return false;}}

        }
        return true;}
    }
