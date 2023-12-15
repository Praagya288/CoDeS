// Write a program to check whether the given array is palindrome or not.

class a_Palindrome{

    public static void main(String[] args){

        int arr[] = {1,2,3,2,1};

        int n = arr.length ;

        int flag = 0 ;
        System.out.println("The length of array: " + n) ;

        for(int i = 0 ; i<n/2 ; i++){
            if(arr[i]!=arr[n-i-1]){
                System.out.println("Not palindrome");
                flag  = 1 ;
                break ;
            }
        }

        if(flag==0){
            System.out.println("Palindrome") ;
        }
    }
}

// Time Complexity = O(n)
// Reason :
// The loop iterates n/2 times.
// The work done inside the loop is constant for each iteration.
// So, the overall time complexity is O(n/2), but 
// in big O notation, constant factors are typically dropped, resulting 
// in a simplified time complexity of O(n)

// Space Complexity = O(1)
// Reason : No extra space is used 
// Reason in detail :
// Space complexity is O(1) because the amount of memory your 
// program uses doesn't grow with the size of the input array.
// The variables (`n`, `flag`, `i`) and the array `arr` all use a constant
// amount of memory, regardless of how big the array is. In big O notation,
// we express this as O(1), indicating constant space complexity.

// ------------------------------------------------------------------
// Additional question
// Q- Take the array input from the user
/*
import java.util.Scanner ;

public class a_Palindrome {
    
  public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];

        System.out.println("Enter the elements of array");
        for(int i = 0 ; i<size ; i++){
            arr[i] =  sc.nextInt() ;
        }
        

        int flag = 0 ;
        for(int i = 0 ; i<size/2 ; i++){
            if(arr[i]!=arr[size-i-1]){
                System.out.println("Not palindrome");
                flag  = 1 ;
                break ;
            }
        }

        if(flag==0){
            System.out.println("Palindrome") ;
        }
    }

}
*/