import java.util.Scanner;
import java.util.Arrays;
/* Write a function named allValuesTheSame that returns 1 if all elements of its
argument array have the same value. Otherwise, it returns 0.
If you are programming in Java or C#, the function signature is
int allValuesTheSame(int[ ] a)
If you are programming in C or C++, the function signature is
int allValuesTheSame(int a[ ], int len) where len is the number of elements in a*/
public class Main {

    public static int allValuesTheSame(int[ ] a){
        if(a.length < 1)return 0;
        for(int i=1;i<a.length;i++){
            if(a[0]!=a[i]) return 0;
        }

    return 1;
    }

    public static void main(String[] args){


        System.out.println(allValuesTheSame(new int[]{ -1} ));

    }

   }
