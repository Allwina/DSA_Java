import java.util.*;
public class SearchIn2D{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int r,c;
        System.out.println("Enter the num of rows");
        r = in.nextInt();
        System.out.println("Enter the num of Columns");
        c = in.nextInt();
        int[][] ar = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.println("Enter the element");
                ar[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the target");
        int target = in.nextInt();
        int[] ans = search(ar, target);
        
        if(ans != null){
            System.out.println("Element found at row " + ans[0] + ", column " + ans[1]);
        } else {
            System.out.println("Element not found");
        }
    }
    
    static int[] search(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j}; // Return the row and column as an array
                }
            }
        }
        return null; // Return null if target is not found
    }
}
