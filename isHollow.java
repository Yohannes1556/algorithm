import java.util.Arrays;
import java.math.*;

/*  An array is said to be hollow if it contains 3 or more zeros in the middle that are
preceded and followed by the same number of non-zero elements. Furthermore, all the
zeroes in the array must be in the middle of the array. Write a function named isHollow
that accepts an integer array and returns 1 if it is a hollow array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isHollow(int[ ] a)
If you are programming in C or C++, the function signature is
int isHollow(int a[ ], int len) where len is the number of elements in the array */
public class Main {

    public static int isHollow(int[ ] a) {
        int countZero=0,countBeforeZero=0,countAfterZero=0;
        boolean isBeforeZero=false;
        boolean isAfterZero=false;
        boolean isOnlyZero=false;
        if(a[0]==0) isOnlyZero=true;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0&&countZero==0){
                isBeforeZero=true;
                countBeforeZero +=1;
            }
            if(isOnlyZero && a[i]!=0)return 0;
            if(a[i]==0) countZero++;
            if(countZero!=0 && a[i]!=0){
                countAfterZero++;
                isAfterZero=true;
            }
            if(isAfterZero && a[i]==0)return 0;
        }
        if(countZero < 3)return 0;

    return countAfterZero==countBeforeZero ? 1:0;
    }

    public static void main(String[] args){


        System.out.println(isHollow(new int[]{1,2,0,0,0,3,4} ));

    }

   }
