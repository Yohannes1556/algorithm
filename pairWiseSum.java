import java.util.Scanner;
import java.util.Arrays;
/*Write a method named pairwiseSum that has an array with an even number of elements as a parameter
and returns an array that contains the pairwise sums of the elements of its parameter array.
If you are writing in Java or C#, the function signature is
int[ ] pairwiseSum(int[ ] a)
If you are writing in C or C++, the function signature is
int * pairwiseSum(int a[ ], int len) where len is the length of a
The method returns null if
1. The array has no elements
2. The array has an odd number of elements
Otherwise, the method returns an array with arrayLength/2 elements. Each element of the returned array is
the sum of successive pairs of elements of the original array. See examples for more details.*/
public class Main {

    public static int[] pairWiseSum(int[] a){
        if(a.length < 2 || a.length % 2 != 0) return null;
        int[] returnArray = new int[a.length /2];
        for(int i=0,k=0;i<a.length-1;i+=2,k++){

            returnArray[k]= a[i]+a[i+1];

        }

    return returnArray;
    }

    public static void main(String[] args){


        System.out.println(Arrays.toString(pairWiseSum(new int[]{} )));

    }

   }
