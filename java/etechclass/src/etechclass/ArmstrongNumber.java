package etechclass;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int U = obj.nextInt();
        System.out.println("The number is " + U);

        int h = U;
        int j = 0;
        int k = 0;
        while (U!=0) {
            j = U%10 ;
            k = k + j*j*j;
            U = U/10 ;
        }
        if (k ==h ){
            System.out.println("it is armstrong number");
        }
        else
            System.out.println("it is not an armstrong number");
    }
}

