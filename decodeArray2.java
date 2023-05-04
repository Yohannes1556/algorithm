import java.util.Scanner;
import java.util.Arrays;
/*. An integer number can be encoded as an array as follows. Each digit n of the number is represented by n
zeros followed by a 1. So the digit 5 is represented by 0, 0, 0, 0, 0, 1. The encodings of each digit of a
number are combined to form the encoding of the number. So the number 1234 is encoded as the array {0,
1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}. The first 0, 1 is contributed by the digit 1, the next 0, 0, 1 is contributed
by the digit 2, and so on.
There is one other encoding rule: if the number is negative, the first element of the encoded array must be -
1, so -201 is encoded as {-1, 0, 0, 1, 1, 0, 1}. Note that the 0 digit is represented by no zeros, i.e. there are
two consecutive ones!
Write a method named decodeArray that takes an encoded array and decodes it to return the number.
You may assume that the input array is a legal encoded array, i.e., that -1 will only appear as the first
element, all elements are either 0, 1 or -1 and that the last element is 1.
If you are programming in Java or C#, the function prototype is
int decodeArray(int[ ] a)
If you are programming in C or C++, the function prototype is
int decodeArray(int a[ ], int len); */
public class Main {

public static int decodeArray(int[] a){
    if(a[0]==1) return 0; // 0 1
    int sign=1;
    int number = 0;
    int count = 0;
    for(int i = 0;i < a.length;i++){ //2
        if(a[i] ==-1) { sign=-1;
            }

        if(a[i]==0){
            count +=1;
        }
        if(a[i]==1){
            number = number * 10 + count;
            count=0;

        }

    }
    return number * sign;
}




    public static void main(String[] args){

        System.out.println(decodeArray(new int[]{0,0,1}));

    }

   }
