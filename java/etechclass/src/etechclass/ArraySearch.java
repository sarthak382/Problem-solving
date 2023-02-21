package etechclass;


import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int U ;
        int j = -1 ;
        System.out.println("Enter the number");
        U = obj.nextInt();
        System.out.println("searching for number " + U);

        int arr[]={33,3,4,5};

        for (int i = 0;  i< arr.length ; i++){
            if (U == arr[i]){
                j =  i;
            }
            else ;
        }
        if (j== -1){
            System.out.println("the number " + U + " does not exist");
        }
        else
            System.out.println("the number " + U + " does exist and its index is  " + j);
    }
}


