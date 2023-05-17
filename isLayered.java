import java.util.Arrays;
import java.math.*;

/* An array is called layered if its elements are in ascending order and each element
appears two or more times. For example, {1, 1, 2, 2, 2, 3, 3} is layered but {1, 2, 2, 2, 3,
3} and {3, 3, 1, 1, 1, 2, 2} are not. Write a method named isLayered that accepts an
integer array and returns 1 if the array is layered, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isLayered(int[ ] a)
If you are programming in C or C++, the function signature is
int isLayered(int a[ ], int len) where len is the number of elements in the array*/
public class Main {

    public static int isLayered(int[ ] a) {
        if(a.length<2)return 0;
        for(int i=0;i<a.length;i++){
            if(i<a.length-1){
                if(a[i+1]-a[i] < 0) return 0;
            }
            int occurence=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    occurence +=1;
                }
            }
            if(occurence < 2)return 0;
        }
        return 1;

    }

    public static void main(String[] args){


        System.out.println(isLayered(new int[]{1, 1, 2, 2, 2, 3, 3} ));

    }

   }
