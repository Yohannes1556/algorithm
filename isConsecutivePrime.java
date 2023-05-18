import java.util.Arrays;
import java.math.*;

/*  A positive number n is consecutive-factored if and only if it has factors, i and j where i
> 1, j > 1 and j = i + 1. Write a function named isConsecutiveFactored that returns 1 if
its argument is consecutive-factored, otherwise it returns 0 */
public class Main {

    public static int isConsectiveFactored(int n) {
        if(n<2)return 0;
        int originalNum = n;
        int count = 0;
            for(int i=2;i<= originalNum;i++){
                if(originalNum % i==0) {
                    count += 1;
                    originalNum /=i;
                    i=1;

                }

            }
            int[] solutionArray=new int[count];
        for(int i=2,k=0;i<= n;i++){
            if(n % i==0) {
                solutionArray[k]=i;
                k++;
                n /=i;
                i=1;

            }

        }
        for(int i=0;i<solutionArray.length;i++){
            if(i<solutionArray.length-1){
                if(solutionArray[i]+1==solutionArray[i+1]) return 1;
            }

        }

        return 0;

    }

    public static void main(String[] args){


        System.out.println(isConsectiveFactored(12));

    }

   }
