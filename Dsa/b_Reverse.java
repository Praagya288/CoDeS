// Q- Write a program to reverse the elements of an array.(For Loop)
// Leetocode = 344
 
import java.util.Scanner;

 class b_Reverse{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in) ;

        // Array size 
        System.out.println("Enter the size of the array: ") ;
        int n = sc.nextInt();

        // creating a new array 
        int arr[] = new int[n] ;
        
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt() ;
        }

        // swapping the elements 
        for(int i = 0 ; i<n/2 ; i++){
            int temp = arr[i] ;
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp ;
        }
        
        // printing the reversed array
        System.out.println("Array after reversing");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ") ;

        }
    }

}


// Time Complexity = O(n)
// Space Complexity = O(1)

// ---------------------------------------------------------
// Using while loop
/* 
import java.util.Scanner;

public class b_Reverse {
        public static void main(String[] args){
                    Scanner sc = new Scanner(System.in) ;

        // Array size 
        System.out.println("Enter the size of the array: ") ;
        int n = sc.nextInt();

        // creating a new array 
        int arr[] = new int[n] ;
        
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt() ;
        }

        int start = 0 ;
        int end = arr.length-1 ;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;
            start ++ ;
            end -- ;
        }   
    
        System.out.println("array after reversing");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] +  " ") ;
        }

        }
}
*/