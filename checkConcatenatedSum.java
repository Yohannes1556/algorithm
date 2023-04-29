import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static int checkConcatenatedSum(int n,int catLen){
        int originalNumber = n;
        int totalSum = 0;
        while(n != 0){

            int digit = n%10;
            int concatSum = 0;

            for(int i = 0; i < catLen;i++){
                concatSum = (concatSum * 10) + digit;
            }
            totalSum += concatSum; //
            n/=10;  //19


        }
        return totalSum == originalNumber ? 1 : 0;
    }

    public static void main(String[] args){
        System.out.println(checkConcatenatedSum(8,1));
    }

   }
