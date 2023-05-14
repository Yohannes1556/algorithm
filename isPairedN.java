import java.util.Scanner;
import java.util.Arrays;
/*. 3. An array is defined to be paired-N if it contains two distinct elements that sum to N for some specified
value of N and the indexes of those elements also sum to N. Write a function named isPairedN that returns
1 if its array parameter is a paired-N array, otherwise it returns 0. The value of N is passed as the second
parameter.
If you are writing in Java or C#, the function signature is
int isPairedN(int[ ] a, int n)
If you are writing in C or C++, the function signature is
int isPairedN(int a[ ], int n, int len) where len is the length of a
There are two additional requirements.
1. Once you know the array is paired-N, you should return 1. No wasted loop iterations please.
2. Do not enter the loop unless you have to. You should test the length of the array and the value of n to
determine whether the array could possibly be a paired-N array. If the tests indicate no, return 0 before
entering the loop.  */
public class Main {

    public static int isPairedN(int[ ] a, int n)  {
        int size = a.length;
        if(size < 2 || size-2 + size-1 < n  || n < 1) return 0;
        for (int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i != j){
                    if(a[i] + a[j] == n && i + j ==n  ) return 1;
                }
            }

        }
        return 0;
    }

    public static void main(String[] args){


        System.out.println(isPairedN(new int[]{8, -8, 8, 8, 7, 7, -7}   ,15));

    }

   }
