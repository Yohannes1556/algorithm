import java.util.Scanner;
import java.util.Arrays;
/*The Fibonacci sequence of numbers is 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The first and second
numbers are 1 and after that ni
 = ni-2 + ni-1, e.g., 34 = 13 + 21. Write a method with signature
int isFibonacci(int n) which returns 1 if its argument is a number in the Fibonacci sequence,
otherwise it returns 0. For example, isFibonacci(13) returns a 1 and isFibonacci(27) returns a 0.
Your solution must not use recursion because unless you cache the Fibonacci numbers as you
find them, the recursive solution recomputes the same Fibonacci number many times.
*/
public class Main {

    public static int isFibionacci(int n) {
        if (n > 0) {

            int a = 0, b = 1, c = 0;

            do {
                a = b;
                b = c;
                c = a + b;
                if (c == n) {
                    return 1;
                }
                if (c > n) return 0;
            } while (c <= n);


        }

        return 0;


    }

    public static void main(String[] args){


        System.out.println(isFibionacci(8));

    }

   }
