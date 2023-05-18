import java.util.Arrays;
import java.math.*;

/* . A twin prime is a prime number that differs from another prime number by 2. Write a
function named isTwinPrime with an integer parameter that returns 1 if the parameter is
a twin prime, otherwise it returns 0. Recall that a prime number is a number with no
factors other than 1 and itself.*/
public class Main {

    public static int isTwinPrime(int n)  {
        boolean isPrime1=true;
        boolean isPrime2=true;

        for(int i=2;i<n+2;i++){
            if((n+2)%i ==0){ isPrime1=false;}
            if(i<n){
                if(n%i==0)return 0;
            }


            if(i<n-2){
                if((n-2)%i==0)isPrime2=false;}



        }System.out.println(isPrime1);
        System.out.println(isPrime2);
        return isPrime1==true ||isPrime2==true? 1:0;

    }

    public static void main(String[] args){


        System.out.println(isTwinPrime(53));

    }

   }
