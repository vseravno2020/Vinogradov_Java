package uroven_2;

  /*
  Вычислить выражение 1- 1/2 +1/3 -1/4 + +1/ 9999-1/10000 , используя оператор условия.
   */

public class Zadanie_2 {
    public static void main(String[] args) {
        double start = 1;
        for(int i = 2;i<10001;i++){
            if(i%2==0){
                start -= (1.0/i);
            } else{
                start += (1.0/i);
            }
        }
        System.out.print(start);
    }
}
