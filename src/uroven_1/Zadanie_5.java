//        5. Составьте программу для нахождения длины катета
//        прямоугольного треугольника (b), если известны длины
//        гипотенузы (c) и катета (a). Результат вывести на кон-
//        соль.

package uroven_1;

import java.util.Scanner;

public class Zadanie_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите катет: ");
        double kat = in.nextDouble();
        System.out.printf("Введите гипотенузу: ");
        double gip = in.nextDouble();
        double pif = Math.sqrt(Math.abs(gip)-Math.abs(kat));
        System.out.printf("Второй катет равен %f",pif);
        in.close();
    }
}
