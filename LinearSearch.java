import java.util.*;

public class LinearSearch {
    public int linearSearch(int[] A, int B) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                return 1;
            }
        }
        return 0; // Return 0 if the element is not found
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, search;

        System.out.println("Enter the max length of array");
        n = in.nextInt();

        int arr[] = new int[n]; // Create the array with the specified length

        System.out.println("Enter the element to be found");
        search = in.nextInt();

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        LinearSearch solution = new LinearSearch();
        int k = solution.linearSearch(arr, search);

        if (k == 1) {
            System.out.println(search + " is present in the array");
        } else {
            System.out.println(search + " is not present in the array");
        }
    }
}
