package etechclass;

public class DecendindOrderThird {
    public static void main(String[] args){
        int arr[] = {3,9,8,2};
        int arr2[] = new int[arr.length];
        int i = 0 ;
        int h = arr[0];
        int p = arr[i+1];
        int high = 0;

        for ( i = 0 ; i<arr.length ; i++){
//            System.out.println(arr[i]);
            h =  arr[i];
            for ( int j = i + 1 ; j<arr.length ; j++){
                p =  arr[j];
                if (h<p){
                    high = arr[j];
                }
                else;
            }
        }
        System.out.println(high);



    }
}
