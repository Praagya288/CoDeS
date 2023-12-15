// Input and output in 2D Arrays
/*
import java.util.Arrays ;
import java.util.Scanner ;
public class f_Input_and_output_in2DArrays {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3] ;

        
        System.out.println("Enter the elements of the array");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                    arr[row][col] = sc.nextInt() ;
            }
        }


        // Printing Method 1

        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr.length; col++) {
        //            System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // Printing Method 2
        
        // for(int row = 0 ; row< arr.length ; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

         // Printing Method 3

        // for(int[] a : arr){
        //     System.out.println(Arrays.toString(a));
        // }
      
    }

}

*/


// printing the array with different column size 
/*
public class f_Input_and_output_in2DArrays {

        public static void main(String[] args) {
            
            int[][] arr = {
                {1,2,3,4},
                {2,3},
                {2,3,4}
            };
    
            for (int row = 0; row < arr.length; row++) {
                for (int col  = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
            }

        }
    
}
*/