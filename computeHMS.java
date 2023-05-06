import java.util.Scanner;
import java.util.Arrays;
/*Write a method named computeHMS that computes the number of hours, minutes and seconds in a
given number of seconds.
If you are programming in Java or C#, the method signature is
int[] computeHMS(int seconds);
If you are programming in C or C++, the method signature is
int * computeHMS(int seconds);
The returned array has 3 elements; arr[0] is the hours, arr[1] is the minutes and arr[2] is the seconds
contained within the seconds argument.
Recall that there are 3600 seconds in an hour and 60 seconds in a minute. You may assume that the
numbers of seconds is non-negative. .*/
public class Main {

    public static int[] computeHMS(int seconds)  {
        int[] answer = new int[3];

        if(seconds % 3600 >= 1){
            answer[0]= seconds /3600;
            seconds %= 3600;
        }
        if(seconds % 60 >=1){
            answer[1]= seconds /60;
            seconds %= 60;
        }
        if(seconds <60){
            answer[2] = seconds;
        }

        return answer;
    }

    public static void main(String[] args){


        System.out.println(Arrays.toString(computeHMS(380 )));

    }

   }
