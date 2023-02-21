package etechclass;


//MAX
public class MinMax {
    public static void main(String[] args){
        int j = 0;
        int arr[]={33,3,4,5};
        j = arr[0];
        for (int i = 0;  i< arr.length ; i++){

            if (j<arr[i]){
                j = arr[i];
            }
            else ;
        }
        System.out.println(j);
    }
}

//    here i is used to acess the vale of the array as it used an index number then
//    j is used to store the values of array so it cam be compared to all the valus of the are


//MIN
 class Min {
    public static void main(String[] args){
        int j = 0;
        int arr[]={33,3,4,5};
        j = arr[0];
        for (int i = 0;  i< arr.length ; i++){

            if (j>arr[i]){
                j = arr[i];
            }
            else ;
        }
        System.out.println(j);
    }
}