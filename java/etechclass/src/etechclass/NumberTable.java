package etechclass;

import java.util.Scanner;

public class NumberTable{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Unit");
        int U = obj.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(U + "x" + i + "=" + U*i);
        }


    }
}


