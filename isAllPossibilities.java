import java.util.Arrays;
import java.math.*;

/* . A non-empty array a of length n is called an array of all possiblities if it contains
all numbers between 0 and a.length-1 inclusive. Write a method named isAllPossibilities
that accepts an integer array and returns 1 if the array is an array of all possiblities,
otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isAllPossibilities(int[ ] a) */
public class Main {

    public static int isAllPossibilities(int[ ] a) {
        if(a.length < 1) return 0;
        for(int i=0;i<a.length;i++){
            boolean isFound = false;
            for(int j=0;j<a.length;j++){
                if(a[j]==i){
                    isFound=true;
                    break;
                }
            }
            if(!isFound) return 0;
        }
        
    return 1;
    }

    public static void main(String[] args){


        System.out.println(isAllPossibilities(new int[]{0} ));

    }

   }
