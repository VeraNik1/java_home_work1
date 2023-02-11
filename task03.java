import java.util.Scanner;

public class task03 {
    public static void main(String[] args){
        while (true) {
            try {
                Scanner inter = new Scanner (System.in);
                System.out.println ("Введите первое число" );
                double num1 = inter.nextDouble();
                System.out.println ("Введите второе число" );
                double num2 = inter.nextDouble();
                System.out.println ("Введите одно из следующих действий:\n '/'- деление;\n '*' - умножение;\n '+' - сумма; \n '-' - разность; \n '^' - возведение в степень");
                char op = inter.next().charAt(0); 
                double ans;
                switch(op) {
                    case '+': ans = num1 + num2;
                    break;
                    case '-': ans = num1 - num2;
                    break;
                    case '*': ans = num1 * num2;
                    break;
                    case '/': {
                    if(num2 == 0){
                        System.out.printf("На ноль делить нельзя!");
                        return;
                    }
                    ans = num1 / num2;
                    break;}
                    case '^': ans = Math.pow(num1 , num2);
                    break;
                    default:  System.out.printf("Ошибка, введен некорректный оператор");
                    return;}
                
                System.out.printf("%.0f %s %.0f = %s", num1, op, num2, ans);
                break;}
    
            catch (Exception e) 
                      {System.out.println("Некорректный ввод чисел, попробуйте еще раз!");
                       }
                      } 
                      }
   }
                     

