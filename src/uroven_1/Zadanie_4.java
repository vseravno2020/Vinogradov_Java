//        4. Определить время свободного падения материаль-
//        ного тела с заданной высоты h. Результат вывести в кон-
//        соль.

package uroven_1;

import java.util.Scanner;

public class Zadanie_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Write height: ");
        double height = in.nextDouble();
        if(height <= 0) {
            System.out.printf("Error: Height <= 0");
        }
        else{
            double time = Math.sqrt((2*height)/(9.8));
            System.out.printf("%f sec.",time);
        }
        in.close();
    }
}
