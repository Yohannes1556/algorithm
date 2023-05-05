import java.util.Scanner;
import java.util.Arrays;
/* A hodder number is one that is prime and is equal to 2j
-1 for some j. For example, 31
is a hodder number because 31 is prime and is equal to 25
-1 (in this case j = 5). The first 4
hodder numbers are 3, 7, 31, 127
Write a function with signature int isHodder(int n) that returns 1 if n is a hodder
number, otherwise it returns 0.
Recall that a prime number is a whole number greater than 1 that has only two whole
number factors, itself and 1.  */
public class Main {

public static int isHodder(int n){
    if(n < 3) return 0;
    for(int i=2;i<n;i++){
        if(n%i==0) return 0;
    }
    int checkNumber=1;
    for(int i=1;i<n;i++){
        checkNumber = checkNumber * 2;
        if(checkNumber-1 == n) return 1;
        if(checkNumber -1 > n )break;
    }
    return 0;
    }





    public static void main(String[] args){

        System.out.println(isHodder(120));

    }

   }
