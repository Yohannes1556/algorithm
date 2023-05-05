import java.util.Scanner;
import java.util.Arrays;
/*.. A number n is called prime happy if there is at least one prime less than n and the sum of all primes less
than n is evenly divisible by n.
Recall that a prime number is an integer > 1 which has only two integer factors, 1 and itself
The function prototype is int isPrimeHappy(int n); */
public class Main {

public static int isPrimeHappy(int n) {
    if(n<=2) return 0;
    int sum =0;
    int originalNumber = n;

    for (int i = n-1;i>1;i--){
        boolean isPrime = true;
        for(int j=2;j<i;j++){
            if(i%j==0) {
                isPrime =false;
                break;
            }
        }
        if(isPrime) sum +=i;
    }


    return sum %originalNumber ==0? 1:0;


}




    public static void main(String[] args){

        System.out.println(isPrimeHappy(8));

    }

   }
