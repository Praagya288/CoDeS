// Bubble Sort
public class h_bubble_Sort {
    

    public static void main(String[] args) {
        int[] arr = {2  , 3 , 4 , 5 ,1};


        boolean sorted = true ;
        int n = arr.length ;
        for (int i = 0; i < (n); i++) {
            for (int j = 0; j < (n-i-1); j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                    sorted = false ;
                }
            }
            if(sorted){
                System.out.println("Array already sorted");
                break ;
            }
       
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +  " "); 
        }
          
    }
}
