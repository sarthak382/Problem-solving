package etechclass;


public class DecendindOrderFirst {
    public static void main(String[] args){
        int arr[] = {3,9,8,2};
        int h = arr[0];
        int h2 = arr[1];
        int h3 = arr[2];
        int h4 = arr[3];
        int j ;
        int k;
        int m ;
        for (int i = 0 ; i<arr.length ; i++){
//            System.out.println(arr[i]);
            if (h<arr[i]){
                h = arr[i];

            }
            else;
        }
        System.out.println(h);
        for (j =1; j < arr.length ; j++){
            if (h2<arr[j]){
                h2 = arr[j];
            }
            else;
        }
        System.out.println(h2);

        for (k =2; k < arr.length ; k++){
            if (h3<arr[k]){
                h3 = arr[k];
            }
            else;
        }
        System.out.println(h3);
        for (m =3; m < arr.length ; m++){
            if (h4<arr[m]){
                h4 = arr[m];
            }
            else;
        }
        System.out.println(h4);
    }
}


