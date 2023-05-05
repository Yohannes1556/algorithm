import java.util.Scanner;
import java.util.Arrays;
/*. An onion array is an array that satisfies the following condition for all values of j and k:
if j>=0 and k>=0 and j+k=length of array and j!=k then a[j]+a[k] <= 10
Write a function named isOnionArray that returns 1 if its array argument is an onion array and returns 0 if
it is not.
Your solution must not use a nested loop (i.e., a loop executed from inside another loop). Furthermore,
once you determine that the array is not an onion array your function must return 0; no wasted loops cycles
please!
If you are programming in Java or C#, the function signature is
int isOnionArray(int[ ] a)
If you are programming in C or C++, the function signature is
int isOnionArray(int a[ ], int len) where len is the number of elements in the array a.*/
public class Main {

public static int isOnionArray(int[ ] a) {
    if(a.length==0 || a.length==1)return 1;

    for(int i=0,j=a.length-1;i<j;i++,j--){
        if(a[i] + a[j] > 10){
            return 0;

        }

    }
    return 1;

}




    public static void main(String[] args){

        System.out.println(isOnionArray(new int[]{-2, 5, 0, 5, 12} ));

    }

   }
