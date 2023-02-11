import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        while (true) {
            try {

                Scanner inter = new Scanner(System.in);
                System.out.println("Введите первое число" );
                double number1 = inter.nextDouble();
                System.out.println("Введите второе число" );
                double number2 = inter.nextDouble();
                System.out.println("Введите одно из следующих действий '/'- деление;\n '*' - умножение;\n' '+' - сумма; \n '-' - разность; \n '^' - возведение в степень");
                String act = inter.next();
                } 

            catch (Exception e) {
                System.out.println("Некорректный ввод, попробуйте еще раз!");
            }
        }

    }

    static double calc(int n1, int n2, char act) {
        if(act == '+'){ return n1 + n2;}
    
        else if(act == '-'){return n1 - n2;}
        else if(act == '/' && n2 != 0){ return n1/n2;}
        else if(act == '+'){return n1+n2;}
        else if(act == '^'){return n1^n2;}
        else if(act == '*'){return n1*n2;}
    }

}


