import java.util.Arrays;
import java.math.*;

/* An array is called zero-balanced if its elements sum to 0 and for each positive
element n, there exists another element that is the negative of n. Write a function named
isZeroBalanced that returns 1 if its argument is a zero-balanced array. Otherwise it
returns 0.
*/
public class Main {

    public static int isZeroBalanced(int[ ] a)  {
        if(a.length<2)return 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0)continue;
            for(int j=0;j<a.length;j++){
                if(a[i]==-a[j]){
                    a[i]=0;
                    a[j]=0;
                }

            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0)return 0;
        }
        return 1;

    }

    public static void main(String[] args){


        System.out.println(isZeroBalanced(new int[]{3} ));

    }

   }
