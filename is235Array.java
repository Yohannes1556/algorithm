import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static int is235Array(int[] a){
        if(a.length==0) return 0;
        int by2 =0,by3=0,by5=0,notdivisible=0;
        for(int i=0;i<a.length;i++){
            if(a[i] % 2 ==0) by2 +=1;
            if(a[i]%3==0) by3+=1;
            if(a[i]%5==0) by5+=1;
            if (a[i]%2 != 0 && a[i]%3 != 0 && a[i]%5 != 0) notdivisible +=1;

        }
        if(by2 + by3 + by5 + notdivisible != a.length) return 0;
        return 1;

    }

    public static void main(String[] args){

        System.out.println(is235Array(new int[]{2,4,8,16,32}));
    }

   }
