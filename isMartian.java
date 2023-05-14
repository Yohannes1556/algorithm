import java.util.Scanner;
import java.util.Arrays;
/*. Define an array to be a Martian array if the number of 1s is greater than the number of 2s and no two
adjacent elements are equal. Write a function named isMartian that returns 1 if its argument is a Martian
array; otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isMartian(int[ ] a)
If you are programming in C or C++, the function signature is
int isMartian(int a[ ], int len) where len is the number of elements in the array a.
There are two additional requirements.
1. You should return 0 as soon as it is known that the array is not a Martian array; continuing to analyze the
array would be a waste of CPU cycles.
2. There should be exactly one loop in your solution. */
public class Main {

    public static int isMartian(int[ ] a)  {
        if(a.length ==0) return 0;
        int countOne = 0;
        int countTwo = 0;

        for(int i=0; i<a.length;i++ ){
            if(i < a.length-1){
                if(a[i] == a[i+1]) return 0;
            }

            if(a[i]==1) countOne +=1;
            if(a[i]==2) countTwo +=1;

        }
        return countOne > countTwo ? 1:0;
    }

    public static void main(String[] args){


        System.out.println(isMartian(new int[]{}));

    }

   }
