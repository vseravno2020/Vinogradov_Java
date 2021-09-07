//2. Составьте программу расчета факториала для произвольного числа n<10.

package uroven_1;

import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write f: ");
        int f = in.nextInt();
        int output = 1;
        if(f<0){
            System.out.printf("Error: f < 0");
        }
        else{
            for(int i = 1;i<f;i++){
                output+=output*i;
            }
            System.out.printf("F %d = %d",f,output);
        }
        in.close();
    }
}
