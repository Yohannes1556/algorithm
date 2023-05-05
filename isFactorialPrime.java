import java.util.Scanner;
import java.util.Arrays;
/*. A positive, non-zero number n is a factorial prime if it is equal to factorial(n) + 1 for some n and it is
prime. Recall that factorial(n) is equal to 1 * 2 * ... * n-1 * n. If you understand recursion, the recursive
definition is
factorial(1) = 1;
factorial(n) = n*factorial(n-1).
For example, factorial(5) = 1*2*3*4*5 = 120.
Recall that a prime number is a natural number which has exactly two distinct natural number divisors: 1
and itself.
Write a method named isFactorialPrime which returns 1 if its argument is a factorial prime number,
otherwise it returns 0.
The signature of the method is
int isFactorialPrime(int n)  */
public class Main {

public static int isFactorialPrime(int n) {
    if(n<2) return 0;
    for(int i=2;i<n;i++){
        if(n%i==0) return 0;}

        for(int i =1; i<=n;i++){
            int factorial = 1;
            for(int j=1;j<=i;j++){
                factorial = factorial * j ;
            }
            if(factorial + 1 ==n) return 1;
            if(factorial +1 >=n ) break;

        }
        return 0;
    }





    public static void main(String[] args){

        System.out.println(isFactorialPrime(721));

    }

   }
