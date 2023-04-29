import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static int fun1(int[] a){
        int[] answer = new int[a.length -1 ];
        for(int i = 1 ,j=0; i < a.length;i++ , j++){
            answer[j] = a[i] + a[i-1];

        }
        int largestAdjacent = answer[0];
        for(int i = 1;i<answer.length;i++){
            if(answer[i] > largestAdjacent){
                largestAdjacent = answer[i];
            }
        }
        return  largestAdjacent;
    }






    public static void main(String[] args){
        int[] num = {1,1,1,1,1,1};
        System.out.println(fun1(num));




    }
}
