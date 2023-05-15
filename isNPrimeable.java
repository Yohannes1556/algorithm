import java.util.Scanner;
import java.util.Arrays;
/*. Define an array to be n-primeable if for a given n, all elements of the array when incremented by n are
prime. Recall that a prime number is a number that has no factors except 1 and itself. Write a method
named isNPrimeable that has an array parameter and an integer parameter that defines n; the method
returns 1 if its array parameter is n-primeable; otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isNPrimeable(int[ ] a, int n)
If you are programming in C or C++, the function signature is
int isNPrimeable(int a[ ], int len, int n) where len is the number of elements in the array a.  */
public class Main {

    public static int isNPrimeable(int[ ] a, int n)  {
        for(int i=0;i<a.length;i++){
            a[i]= a[i] + n;
            for(int j=2;j<a[i];j++){
                if(a[i] % j == 0) return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args){


        System.out.println(isNPrimeable(new int[]{}  ,2));

    }

   }
