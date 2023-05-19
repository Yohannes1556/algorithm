import java.util.Arrays;
import java.math.*;

/*
*/
public class Main {

    public static int nUpCount(int[] a, int n){
        int upCount =0;
        int partialSum=0;
        int previousSum=0;

        for(int i=0;i<a.length;i++){
            previousSum =partialSum;
            partialSum +=a[i];
            if(previousSum <=n && partialSum > n){
                upCount+=1;
            }
        }
        return upCount;
    }

    public static void main(String[] args){


        System.out.println(nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5));

    }

   }
