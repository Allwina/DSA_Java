import java.util.*;
public class OrderAgnosticBinary
{
    public static void main(String[] args)
    {
        // int arr[]={2,3,4,16,28,30};
        int arr[]={99,80,70,60,50};
        int target = 70;
        int ans=orderAgnosticBinary(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBinary(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        //find whether array sorted in ascending or descending
        boolean isAsc;
        if(arr[start]<arr[end])
        {
            isAsc=true;
        }
        else
        {
            isAsc=false;
        }
        while(start<=end)
        {
            // int mid=(start+end)/2;
            // might result in the exceeding of range limit of int
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAsc)
            {
                if(target< arr[mid])
                {
                    end=mid-1;
                }
                else 
                {
                    start=mid+1;
                }
            }
                else{
                    if(target>arr[mid])
                    {
                        end=mid-1;
                    }
                    else 
                    {
                        start=mid+1;
                    }
                }
            }
            
        
        return -1;
    }
}