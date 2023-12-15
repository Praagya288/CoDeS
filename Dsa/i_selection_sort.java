// Selection sort
// maksad h largest element dhundna or end me place karna
public class i_selection_sort {

    public static void main(String[] args) {

        int[] arr = { 3, 1, 5, 4, 2 };
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++) {
        int largest = 0;
       int maxelementindex = 0 ;
            for (int j = 0; j < (n-i); j++) {
                    if(arr[j]>largest){
                         maxelementindex = j;
                         largest = arr[j];
                    }
            }
            if(arr[maxelementindex]!=largest){
                int temp = arr[maxelementindex];
                arr[maxelementindex] = arr[n-i-1] ;
                arr[n-i-1] = temp ;
            }
            
           
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }   

    }
}
