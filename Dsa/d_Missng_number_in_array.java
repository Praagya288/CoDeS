// Given an array nums containing n distinct numbers in the range [0, n], 
// return the only number in the range that is missing from the array.
// leetcode = 268



// Normal(iterative) approach

public class d_Missng_number_in_array {

    public static void main(String[] args) {

        int n = 6;
        int arr[] = { 0, 1, 2, 6, 5, 4 };
        int result = -1;
        int count = 0;
        while (count < n) {
            boolean found = false;
            for (int i = 0; i < n; i++) {

                if (arr[i] == count) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                result = count;
                break;
            }
            count++;
        }
        System.out.println("Missing number is: " + result);
    }
}


// Time complexity = O(n)
// Space complexity = O(1)

// Using mathematical formula
/*
class d_Missng_number_in_array{

    public static void main(String[] args){


        int n = 3 ;
        int arr[] = {2,0,1} ;


        int expectedSum = 0 ;

        // calculating expectedSum
        // for(int i = 0 ; i <=n ; i++){
        //     expectedSum +=  i ;
        // }
            
        // calculating expectedSum using mathematical formula
        expectedSum = n*(n+1)/2 ;
        System.out.println(expectedSum);
        
        int actualSum = 0 ;
        for(int i = 0 ; i<n ; i++){
            actualSum+= arr[i];
        }
        System.out.println(actualSum);

        int missingNumber = expectedSum-actualSum ;
        System.out.println("Mising number in the array is: " + 
        missingNumber) ;
    }
}
*/