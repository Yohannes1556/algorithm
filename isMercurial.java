import java.util.Scanner;
import java.util.Arrays;
/* Define an array to be a Mercurial array if a 3 does not occur between any two 1s.
Write a function named isMercurial that returns 1 if its array argument is a Mercurial
array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isMercurial(int[ ] a)
If you are programming in C or C++, the function signature is
int isMercurial(int a[ ], int len) where len is the number of elements in the array a.
Hint: if you encounter a 3 that is preceded by a 1, then there can be no more 1s in the
array after the 3. */
public class Main {

    public static int isMercurial(int[ ] a) {
        int count1=-1;
        int count3=-1;
        boolean precededByOne= false;

        for(int i=0;i<a.length;i++){
            if(a[i]==1) count1+=1;
            if(a[i]==3) count3+=1;

            if(count1 != -1 && a[i] ==3){
                precededByOne = true;
            }
            if(precededByOne && a[i]==1) return 0;
        }

    return 1;
    }

    public static void main(String[] args){


        System.out.println(isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3} ));

    }

   }
