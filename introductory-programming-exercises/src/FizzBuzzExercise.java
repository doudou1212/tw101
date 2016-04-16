/**
 * Created by sunjing on 4/16/16.
 */
public class FizzBuzzExercise {
    public  void  fizzBuzz(int n) {
        if (n < 0 || n > 100) {
           System.out.print("please input number 1~100");
            return;
        }

        for (int i=1; i <= n; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i%3 ==0 ) {
                System.out.println("Fizz");
            }
            else if (i%5 == 0 ) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }

    }
}
