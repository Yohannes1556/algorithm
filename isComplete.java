import java.util.Scanner;
import java.util.Arrays;
/* . An array is called complete if it contains an even element, a perfect square and two different elements
that sum to 8. For example, {3, 2, 9, 5} is complete because 2 is even, 9 is a perfect square and a[0] + a[3]
= 8.
 Write a function named isComplete that accepts an integer array and returns 1 if it is a complete array,
otherwise it returns 0. Your method must be efficient. It must return as soon as it is known that the
array is complete. Hint: reuse the method you wrote for question 1.
If you are programming in Java or C#, the function signature is
int isComplete(int[ ] a)
If you are programming in C or C++, the function signature is
int isComplete(int a[ ], int len) where len is the number of elements in the array */
public class Main {

    public static int isComplete(int[] a){
        if(a.length < 2) return 0;
        boolean isPerfectSquare = false;
        boolean isEven= false;
        boolean isSumTo8 = false;

        for (int i = 0; i< a.length;i++){
            if(a[i]%2==0) isEven=true;

            if(isSumTo8 == false){
            for (int j=0; j<a.length;j++){
                if(a[i] + a[j] == 8 && i!=j) {
                    isSumTo8 = true;
                    break;}
            }}
            for(int k = 1;k<=a[i];k++){
                if(k*k==a[i]){
                    isPerfectSquare=true;
                    break;}


            }

        if(isEven && isPerfectSquare && isSumTo8) return 1;
        }
        return 0;
    }

    public static void main(String[] args){


        System.out.println(isComplete(new int[]{3, 2, 1, 1, 5, 6}));

    }

   }
