import java.util.Scanner;
import java.util.Arrays;
/* A number n is vesuvian if it is the sum of two different pairs of squares. For example, 50 is
vesuvian because 50 == 25 + 25 and 1 + 49. The numbers 65 (1+64, 16+49) and 85 (4+81,
36+49) are also vesuvian. 789 of the first 10,000 integers are vesuvian.
Write a function named isVesuvian that returns 1 if its parameter is a vesuvian number, otherwise
it returns 0. Hint: be sure to verify that your function detects that 50 is a vesuvian number!
*/
public class Main {

    public static int isVesuvian(int n)
    {
        if(n>0){
            int square1 = 0,square2=0,squareSum=0,count = 0;
            for(int i=1;i*i < n;i++){
                square1 = i*i;
                for(int j=1;j*j<n;j++){
                    square2 = j*j;
                    squareSum =square1+square2;
                    if(squareSum == n){
                        System.out.println(square1);
                        System.out.println(square2);
                        count +=1;
                        break;

                    }
                }
                if(count ==2 ) break;

            }

            return count > 1 ? 1:0;
        }
        return 0;
    }





    public static void main(String[] args){


        System.out.println(isVesuvian(85));

    }

   }
