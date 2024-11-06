import java.util.*;
public class BinarySearch{
    public static void main(String[] args)
    {
     int arr[]={2,3,4,16,28,30};
     int target = 16;
     int ans=search(arr,target);
     System.out.println(ans);
    }
    static int search(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            // int mid=(start+end)/2;
            // might result in the exceeding of range limit of int
            int mid=start+(end-start)/2;
            if(target< arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}