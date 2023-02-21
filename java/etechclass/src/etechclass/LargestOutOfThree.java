package etechclass;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;


public class LargestOutOfThree {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int num1,num2,num3 ;
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        num3 = obj.nextInt();
        if(num1 < num2){
            if (num2>num3){
                System.out.println(num2 + " is largest");
            }
        }
        else {
            if (num3>num2){
                System.out.println(num3 + " is largest");
            }
            else if (num2>num3){
                System.out.println(num2 + " is largest");
            }

        }
    }
}
