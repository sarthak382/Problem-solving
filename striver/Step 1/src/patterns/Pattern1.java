package patterns;

public class Pattern1 {

    public static void main(String[] args){
        int n = 5;
        if (n>20){
            System.out.println("pick a number less than 20");
        }
        else if (n<1){
            System.out.println("pick a number greater  than 1");
        }
        else

            for ( int i = 0 ; i<n ; i++){
                for(int j= 0 ; j<n; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}

