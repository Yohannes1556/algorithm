import java.util.Scanner;
import java.util.Arrays;
/*Define an array to be one-balanced if begins with zero or more 1s followed by zero or more
non-1s and concludes with zero or more 1s. Write a function named isOneBalanced that returns
1 if its array argument is one-balanced, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isOneBalanced(int[ ] a)
If you are programming in C or C++, the function signature is
int isOneBalanced(int a[ ], int len) where len is the number of elements in the array a.*/
public class Main {

    public static int isOneBalanced(int[ ] a)  {
        int countOne=0;
        int countOthers=0;
        boolean isOtherNumEnded = false;
        for(int i=0;i<a.length;i++){
            if(a[i] ==1){
                countOne +=1;
            }
            if(a[i] != 1){
                countOthers+=1;
            }
            if(countOthers != 0 && a[i]==1){
                isOtherNumEnded = true;
            }
            if(isOtherNumEnded && a[i] != 1) return 0;

        }

        return countOne == countOthers ? 1:0;
    }

    public static void main(String[] args){


        System.out.println(isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}     ));

    }

   }
