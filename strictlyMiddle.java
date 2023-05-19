import java.util.Arrays;
import java.math.*;

/*An array with an odd number of elements is said to be centered if
all elements (except the middle one) are strictly greater than the value of the middle element.
Note that only arrays with an odd number of elements have a middle element. Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.
*/
public class Main {


    public static int strictlyMiddle(int[ ] a){
        if(a.length %2==0)return 0;
        int middle= a.length /2;
        for (int i=0;i<a.length;i++){
            if(a[middle]>=a[i]&&middle!=i)return 0;
        }
    return 1;
    }

    public static void main(String[] args){


        System.out.println(strictlyMiddle(new int[]{9} ));

    }

   }
