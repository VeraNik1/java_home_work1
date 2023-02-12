    /*
 * Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */

public class task04{

    public static void main(String[] args){
        findCorrectExpression("2? + ?5 = 65"); // 20 + 45 = 65
        findCorrectExpression("3? + ?3 = 69"); // 36 + 33 = 69
        findCorrectExpression("?4 + ?8 = 69"); // нет решений
        findCorrectExpression("2? + 2? = 56"); }// несколько решений

    static void findCorrectExpression(String userExpr) { //на вход подаем выражение в виде "2? + 4? = 65"
        System.out.println(userExpr);
        String[] expr = userExpr.split("=")[0].split(" ");
        Double result = Double.parseDouble(userExpr.split("=")[1]);
//        printArray(expr);
//        System.out.println(result);
        String a = expr[0];
        String b = expr[2];
        int counter = 0;
        int A;
        int B;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            A = Integer.parseInt(a.replace("?", String.valueOf(i))); 
            B = Integer.parseInt(b.replace("?", String.valueOf(j))); 
            if (A + B == result) {
                    System.out.println(A + " + " + B + " = " + result);
                    counter++;
                }
            }
        }
        if (counter == 0) System.out.println("Решений для данного выражения нет");
        System.out.println();
    }

    static void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(i < array.length - 1 ? "," : "\n");
        }
    
    }}

