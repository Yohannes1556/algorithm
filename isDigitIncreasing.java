import java.util.Scanner;
import java.util.Arrays;
/*. A number is called digit-increasing if it is equal to n + nn + nnn + ... for some digit n between 1 and 9. 
For example 24 is digit-increasing because it equals 2 + 22 (here n = 2) 
Write a function called isDigitIncreasing that returns 1 if its argument is digit-increasing otherwise, it 
returns 0. 
The signature of the method is 
int isDigitIncreasing(int n) */
public class Main {

public static int isDigitIncreasing(int n){
    int digitCount =0;
    int originalNumber=n;

    while(n>0){
        n/=10;
        digitCount +=1;
    }

    for(int i =1;i<=9;i++){
        int sum = 0;
        int digits = 0;
        for(int j=0;j<digitCount;j++){
            digits = digits * 10 + i;
            sum +=digits;
            if(sum == originalNumber) return 1;
            if(sum >= originalNumber) break;
        }
    }
    return 0;
}




    public static void main(String[] args){

        System.out.println(isDigitIncreasing(368));

    }

   }
