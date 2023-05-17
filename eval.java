import java.util.Scanner;
import java.util.Arrays;
import java.math.*;
/*. Write a function named eval that returns the value of the polynomial anx
n
 + an-1x
n1
 + ... + a1x
1
 + a0.
If you are programming in Java or C#, the function signature is
double eval(double x, int[ ] a)
If you are programming in C or C++, the function signature is
double eval(double x, int a[ ], int len) where len is the number of elements in the array */
public class Main {

    public static double eval(double x, int[ ] a) {
        double total = 0;
        for(int i=0;i<a.length;i++){
            if(i==0)total +=a[0];
            else {
                total = total + a[i]* Math.pow(x,i);
            }

        }
        return total;

    }

    public static void main(String[] args){


        System.out.println(eval(10.0,new int[] {0,1}));

    }

   }
