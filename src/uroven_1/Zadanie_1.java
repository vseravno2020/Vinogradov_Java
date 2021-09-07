//1. С помощью цикла вычислите значение выражения 2^n.

package uroven_1;

import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write ex: ");
        int ex = in.nextInt();
        double output = 1;
        if(ex>=0){
            for(int i = 0;i<ex;i++){
                output = output * 2;
            }
        }
        else {
            for(int i = ex;i<0;i++){
                output = output / 2;
            }
        }
        System.out.printf("2 ^ %d = %f",ex,output);
        in.close();
    }
}
