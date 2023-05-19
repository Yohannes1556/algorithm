import java.util.Arrays;
import java.math.*;

/*Write a function to return an array containing all elements common to two given arrays containing distinct positive integers. You should not use any inbuilt methods. You are allowed to use any number of arrays.
The signature of the function is:
int[] f(int[] first, int[] second)*/
public class Main {


    public static int[] f(int[] first, int[] second){
        if(first == null || second ==null)return null;
        if(first.length==0 || second.length==0)return new int[0];
        int[] min;
        if(first.length > second.length){
            min=new int[second.length];

        }else {
            min=new int[first.length];
        }
        int k=0;
        for(int i=0;i<first.length;i++){
            for(int j=0;j< second.length;j++){
                if(first[i]==second[j]){
                    min[k]=first[i];
                    k++;
                }
            }
        }
        int[] finalArray=new int[k];
        for(int i=0;i<k;i++){
            finalArray[i]=min[i];
        }
        return finalArray;
    }

    public static void main(String[] args){


        System.out.println(Arrays.toString(f(new int[]{1, 8, 3, 2, 6},new int[]{2, 6, 1,8,3})));

    }

   }
