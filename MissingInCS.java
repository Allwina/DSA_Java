//given n distinct numbers in the range[0,n] where O(1) and O(N)
//find the missing number in the range
//eg [4,2,1,0] o/p=3 where n=4
import java.util.*;
public class MissingInCS
{
   
    public static void main(String[] args)
    {
        int[] arr={4,0,2,1};
       
        System.out.println(missingnum(arr));
    }
    public static int missingnum(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        //search for first missing number
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j)
            {
                return j;
            }
        }
        return arr.length;

    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}