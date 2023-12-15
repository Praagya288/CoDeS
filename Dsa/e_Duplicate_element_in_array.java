// Find the duplicate elements in an array
// leetcode = 287 (pending)

// My Solution  

/*
public class e_Duplicate_element_in_array {
    public static void main(String[] args) {
        

        int arr[]  = { 4 , 9, 3 , 3 , 6};
        int n = arr.length ;
        int repeat = -1 ;

        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n  ; j++){
                if(arr[i]==arr[j]){
                    repeat = arr[i] ;
                    break ;
                }
            }
            if(repeat!= -1){
                break ;
            }
        }

        if(repeat == -1){
            System.out.println("No duplicate element found");
        }
        else{
            System.out.println("Repeated element is: " + repeat);
        }
    }
}
*/
// Problem -  this will only print the single duplicate element even if
// more than one duplicate is present in the array


// Final solution
/*
public class e_Duplicate_element_in_array {
    public static void main(String[] args) {
        

        int arr[]  = { 4 , 9, 3 , 3 , 6 , 6};
        int n = arr.length ;
        int repeat = -1 ;
      

        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n  ; j++){
                if(arr[i]==arr[j]){
                    repeat = arr[i];
                    System.out.println("Repeated element is: " + arr[i]);
                    break ;
                }
            }
        }

        if(repeat==-1){
            System.out.println("No duplicate element is found");
        }

    }
}
*/


// Time Complexity = O(n^2)
// Space Complexity = O(1)