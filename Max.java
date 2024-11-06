import java.util.*;
public class Max{
    public static void main(String[] args){
        int arr[]={1,2,3,4,25};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));

    }
    static int max(int[] arr){
        int maxnum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxnum)
            {
                maxnum=arr[i];
            }
        }
      return maxnum;
    }
    static int maxRange(int arr[],int start,int end){
        if(end<start)
        {
            return -1;
        }
        if(arr == null)
        {
            return -1;
        }
        int maxval=arr[start];
        for(int i=start;i<=end;i++)
        {
            if(arr[i]>maxval)
            {
                maxval=arr[i];
            }
        }
      return maxval;
    }
}