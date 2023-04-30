import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static int largestPrimeFactor(int a){
        int num = a;
        while(num > 1){
            if(a % num ==0){
                boolean isPrime=true;
                for(int i = 2;i < num;i++){
                    if(num%i==0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime == true) return num;

            }
            num--;
        }
        return 0;
    }

    public static void main(String[] args){

        System.out.println(largestPrimeFactor(6936));
    }

   }
