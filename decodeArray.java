import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static int decodeArray(int[] a){
        int sign = a[0] < 0 ? -1 : 1;
        int digits = 0;
        int finalNumber = 0;
        for(int i = 1;i<a.length;i++){
            digits = a[i-1] - a[i] < 0 ? -(a[i-1] - a[i]) : a[i-1] - a[i];
            finalNumber = finalNumber * 10 + digits;

        }

        return sign * finalNumber;
    }

    public static void main(String[] args){

        System.out.println(decodeArray(new int[]{-1,5,8,17,15} ));

    }

   }
