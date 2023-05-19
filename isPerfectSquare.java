import java.util.Arrays;
import java.math.*;

/*
*/
public class Main {

    public static int isPerfectSquare(int n)  {
        if(n<0)return 0;
        int perfectSquare = n;
        for(int i=0;i<=n+1;i++){
            if(i*i > perfectSquare){
                perfectSquare = i*i;
                break;
            }

        }
        return perfectSquare;

    }

    public static void main(String[] args){


        System.out.println(isPerfectSquare(3));

    }

   }
