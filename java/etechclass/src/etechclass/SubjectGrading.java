package etechclass;

import java.util.Scanner;

public class SubjectGrading {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int eng,math,sci,hindi ;
        System.out.println("Enter English marks");
        eng = obj.nextInt();
        System.out.println("Enter Math marks");
        math = obj.nextInt();
        System.out.println("Enter Science marks");
        sci = obj.nextInt();
        System.out.println("Enter Hindi marks");
        hindi = obj.nextInt();

        int total =  eng + math + sci + hindi ;
        total =  total*100/400  ;
        System.out.println("your overall percentage is " + total +"% so");
        if(eng>=35&&math>=35&&sci>=35&&hindi>=35){
            if (total > 70){
                System.out.println("A grade");
            }
            else if (total >= 61) {
                System.out.println("B grade");
            }
            else if (total >= 50) {
                System.out.println("C grade");
            }
            else if (total <= 49) {
                System.out.println("D grade");
            }
        }
        else
            System.out.println("Fail");


    }
}

