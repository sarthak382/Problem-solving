package etechclass;

import java.util.Scanner;


//1st approach:

//public class ReverseANumber {
//    public static void main(String[] args){
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int U = obj.nextInt();
//        System.out.println("The number is " + U);
//
//        int i = 0;
//        int j;
//        while (U>0) {
//            j = U%10 ;
//            System.out.print(j);
//            U = U/10 ;
//            i++;
//        }
//
//
//    }
//}

//2nd approach:

//public class ReverseANumber {
//    public static void main(String[] args){
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int U = obj.nextInt();
//        System.out.println("The number is " + U);
//
//
//        int j = 0;
//        int k = 0;
//        while (U>0) {
//            j = U%10 ;
//            k = (k + j)*10;
//            U = U/10 ;
//        }
//        System.out.println(k/10);
//
//    }
//}



//3rd approach:

public class ReverseANumber {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int U = obj.nextInt();
        System.out.println("The number is " + U);


        int j = 0;
        int k = 0;
        while (U!=0) {
            j = U%10 ;
            k = k*10 +j;
            U = U/10 ;
        }
        System.out.println(k);

    }
}