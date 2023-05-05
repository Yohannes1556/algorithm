import java.util.Scanner;
import java.util.Arrays;
/*.Write a function named largestDifferenceOfEvens which returns the largest difference between even
valued elements of its array argument. For example largestDifferenceOfEvens(new int[ ]{-2, 3, 4, 9})
returns 6 = (4 - (-2)). If there are fewer than 2 even numbers in the array, largestDifferenceOfEvens should
return -1.
If you are programming in Java or C#, the function signature is
int largestDifferenceOfEvens(int[ ] a)
If you are programming in C or C++, the function signature is
int largestDifferenceOfEvens(int a[ ], int len) where len is the number of elements in the array a. */
public class Main {

public static int largestDifferenceOfEvens(int[ ] a) {
    int count = 0;
    int anyElement = 0;
    for(int i=0;i<a.length;i++){
        if(a[i] %2 ==0){
            count +=1;
            anyElement=a[i];
        }
    }
    if(count >= 2){
        int largest=anyElement;
        int min=anyElement;
        for(int i = 0;i<a.length;i++){
            if(a[i]%2==0){
                if(largest < a[i]) largest =a [i];
                if(min>a[i]) min=a[i];
            }
        }

        return largest - min;
    }
    return -1;
    }





    public static void main(String[] args){

        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));

    }

   }
