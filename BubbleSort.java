import java.util.*;
public class BubbleSort
{
    public static void main(String[] args)
    {
    int arr[]={51,2,33,4,5};
    sort(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr)
    {
       for(int i=0;i< arr.length-1;i++) 
       {
        boolean swapped = false;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
       }
    }
}