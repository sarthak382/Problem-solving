package etechclass;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int U ;
        System.out.println("Enter Unit");
        U = obj.nextInt();
        System.out.println(U);
        if (U>400){
            int Bill = 99 + 200 + 300 + 400 + (U-99-100-100-100) ;
            System.out.println(Bill);
        }
        else if(U>=300){
            int Bill = 99 + 200 + 300 + 4*(U-99-100-100) ;
            System.out.println(Bill);
        }
        else if(U>=200){
            int Bill = 99 + 200  + 3*(U-99-100) ;
            System.out.println(Bill);
        }
        else if(U>=100){
            int Bill = 99  + 2*(U-99) ;
            System.out.println(Bill);
        }
        else {
            int Bill = U ;
            System.out.println(Bill);
        }

    }
}


