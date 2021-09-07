//        3. Даны два действительных числа. Необходимо полу-
//        чить их сумму, разность и произведение. Результат выве-
//        сти на консоль.

package uroven_1;

import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Write first number: ");
        double first = in.nextDouble();
        System.out.printf("Write second number: ");
        double second = in.nextDouble();
        double sum = first+second;
        double dif = first-second;
        double mul = first*second;
        System.out.printf(" Sum: %f .\n Difference: %f .\n Multiplication: %f .\n",sum,dif,mul);
        in.close();
    }
}
