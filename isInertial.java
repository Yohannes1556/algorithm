import java.util.Arrays;
import java.math.*;

/*An array is defined to be inertial if the following conditions hold:
a. it contains at least one odd value
b. the maximum value in the array is even
c. every odd value is greater than every even value that is not the maximum
value.
So {11, 4, 20, 9, 2, 8} is inertial because
a. it contains at least one odd value
b. the maximum value in the array is 20 which is even
c. the two odd values (11 and 9) are greater than all the
 even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}.
However, {12, 11, 4, 9, 2, 3, 10} is not inertial because it fails condition (c),
i.e., 10 (which is even) is greater 9 (which is odd) but 10 is not the maximum
value in the array.
Write a function called isIntertial that accepts an integer array and returns 1 if
the array is inertial; otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isInertial(int[ ] a)
If you are programming in C or C++, the function signature is
int isInertial(int a[ ], int len) where len is the number of elements in the
array
*/
public class Main {

    public static int isInertial(int[ ] a){
        if(a.length <2)return 0;
        int maxNum = a[0];
        int maxIndex=0;
        boolean containsOdd = false;
        for(int i=0;i<a.length;i++){
            if(a[i] > maxNum){
                maxNum=a[i];
                maxIndex=i;
            }
            if(a[i]%2 != 0){
                containsOdd=true;}

        }
        if(!containsOdd || maxNum %2!=0)return 0;

        for (int i=0;i<a.length;i++){
            if(i!=maxIndex){
                for(int j=0;j<a.length;j++){
                    if(j!=maxIndex && i!= j){
                        if(a[i]>a[j] && a[i]%2==0 && a[j]%2!=0&&a[i]!=maxNum)return 0;
                    }
                }

            }

        }
        return 1;
    }

    public static void main(String[] args){


        System.out.println(isInertial(new int[]{2, 12, 4, 6, 8, 11} ));

    }

   }
