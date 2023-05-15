import java.util.Scanner;
import java.util.Arrays;
/*Define an array to be a 121 array if all elements are either 1 or 2 and the array begins with one or more
1s followed by a one or more 2s and then ends with the same number of 1s that it begins with. Write a
method named is121Array that returns 1 if its array argument is a 121 array, otherwise, it returns 0.
If you are programming in Java or C#, the function signature is
int is121Array(int[ ] a)
If you are programming in C or C++, the function signature is
int is121Array(int a[ ], int len) where len is the number of elements in the array a*/
public class Main {

    public static int is121Array(int[] a){
        if(a[0] != 1 || a[a.length-1] !=1 ) return 0;
        int countBeginningOne = 0;
        int countEndingOne = 0;
        boolean isOneEnded = false;

        for(int i=0;i<a.length;i++){
            if(a[i] != 1 && a[i] != 2) return 0;
            if(isOneEnded == false && a[i] == 1) countBeginningOne +=1;
            if(a[i]==2) isOneEnded = true;
            if(isOneEnded == true && a[i] ==1) countEndingOne +=1;

        }


    return countBeginningOne == countEndingOne ? 1:0;

    }

    public static void main(String[] args){


        System.out.println(is121Array(new int[]{2, 2, 2} ));

    }

   }
