import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static int[] doIntegerBasedRounding(int[] a,int n){
        if(n <= 0) return a;

        for(int i=0;i<a.length;i++){
            if(a[i] >=0){
            int lowerBound= a[i]/n * n;
            int upperBound= a[i]/n * n + n;
            int middle = n % 2 ==0 ? lowerBound+n /2 :lowerBound+ n/2+1;
            if(a[i]<middle){
                a[i]=lowerBound;

            }else a[i] = upperBound;

        }}
        return a;

    }

    public static void main(String[] args){

        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{-1,-2,3,4,5},2)));
    }

   }
