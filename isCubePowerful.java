import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static int isCubePowerful(int n){
        if(n <= 0) return 0;
        int originalNum = n;
        int totalSum = 0;
        while(n > 0){
            int digit = n % 10;
            totalSum += digit*digit*digit;
            n /=10;
        }
        return totalSum == originalNum ? 1:0;

    }

    public static void main(String[] args){

        System.out.println(isCubePowerful(87 ));

    }

   }
