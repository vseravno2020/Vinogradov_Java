package lab_5;

import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write number: ");
        int number = in.nextInt();
        switch(number){
            case 0:
                System.out.println("Ноль");
                break;
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            case 5:
                System.out.println("Пять");
                break;
            case 6:
                System.out.println("Шесть");
                break;
            case 7:
                System.out.println("Семь");
                break;
            case 8:
                System.out.println("Восемь");
                break;
            case 9:
                System.out.println("Девять");
                break;
        }
    }
}
