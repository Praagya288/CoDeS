// Insertion Sort
public class j_insertion_sort {

    public static void main(String[] args) {

        int[] arr = { 8, 1, 5, 4, 2 };
        int n = arr.length ;
        for (int i = 0; i < n-1; i++) {
            for(int j = i+1 ; j>0 ; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j] ;
                    arr[j] = arr[j-1] ;
                    arr[j-1] = temp ;
                }
                else{
                    break ; 
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
