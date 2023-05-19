import java.util.Arrays;
import java.math.*;

/*Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
        The signature of the function is:
        int f(int n)*/
public class Main {


    public static int f(int n){
        int reversed = 0;
        int sign=1;
        if(n<0){
            sign=-1;
            n=n*-1;
        };
        while(n>0){
            reversed = reversed*10 + n%10;
            n/=10;
        }
        return reversed*sign;
    }

    public static void main(String[] args){


        System.out.println(f(-123));

    }

   }
