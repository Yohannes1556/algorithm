import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static int hasSingleMaximum(int[] a){
       /* first method
        if(a.length == 0) return 0;
        int maxNumber = a[0];
        for(int i=0; i < a.length; i++){
            if(a[i] > maxNumber){
                maxNumber=a[i];
            }
        }
        int maxCount = 0;
        for(int j = 0;j<a.length;j++){
          if(a[j] == maxNumber){
              maxCount +=1;
          }
      }
        if(maxCount > 1) return 0;
        return 1;

        second method    */
        if(a.length == 0) return 0;
        boolean duplicated = false;
        int max = a[0];

        for(int i= 1 ; i<a.length;i++){
            if(a[i] > max){
            max = a[i];
            duplicated= false;
            }
            else if(a[i] == max){
            duplicated = true;
            }
        }
        if(duplicated == true) return 0;
        return 1;


    }

    public static void main(String[] args){

        System.out.println(hasSingleMaximum(new int[]{0,2,2,6,6,5,7,8}));
    }

   }
