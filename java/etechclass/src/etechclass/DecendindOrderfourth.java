package etechclass;


public class DecendindOrderfourth {
    public static void main(String[] args){
        int arr[] = {3,9,8,12};
        int arr2[] = new int[arr.length];
        int i = 0 ;
        int h = arr[0];
        int p = arr[i+1];
        int k = 0;

        for ( i = 0 ; i<arr.length ; i++){
//            System.out.println(arr[i]);
            h =  arr[i];
//            System.out.println(h);
            for ( int j = i + 1 ; j<arr.length ; j++){
                p =  arr[j];
                if (h<p){
                    h = arr[j];
                    arr[i] = h;
                    System.out.println(arr[i]);
                }
                else;
            }
        }

//         System.out.println(h);
        for ( k = 0 ; k<arr.length ; k++){
            System.out.println(arr[k]);
        }





    }
}


//    value store ho rha hai like [12,9,8,12]
//    humko swipe karna hai [9,3,8,12]

