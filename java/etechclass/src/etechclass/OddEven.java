package etechclass;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int num  = obj.nextInt();
        if(num%2 == 0){
            System.out.println(num + " is even");
        }
        else
            System.out.println(num + " is odd");

    }
}
