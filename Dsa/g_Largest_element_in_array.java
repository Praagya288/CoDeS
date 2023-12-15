// Q- Find the largest element in an array
public class g_Largest_element_in_array {

    public static void main(String[] args) {

        int[] arr = { 4, 7, 9, 2, 1, 6 };
        int n = arr.length;
        int element = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > element) {
                element = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + element);
    }

}