import java.util.Scanner;
import java.util.Arrays;
/*Write a function named hasNValues which takes an array and an integer n as
arguments. It returns true if all the elements of the array are one of n different values.
If you are writing in Java or C#, the function signature is
int hasNValues(int[ ] a, int n)*/
public class Main {

    public static int hasNValues(int[ ] a,int n){
        int size=a.length;
        if(size < n) return 0;
        int countDifferent=0;
        for(int i=0;i<size;i++){
            int j;
            for(j=0;j<i;j++){
                if(a[i]==a[j])break;
            }
            if(i==j)countDifferent++;
        }
        return countDifferent==n ? 1:0;

    }

    public static void main(String[] args){


        System.out.println(hasNValues(new int[]{1} ,1));

    }

   }
