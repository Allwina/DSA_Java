import java.util.*;
public class DisappearedNumCS
{
    public static void main(String[] args)
    {
     int arr[]={4,3,2,7,8,2,3,1};
     System.out.println(findDisappearedNum(arr));
    }
    public static List<Integer> findDisappearedNum(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        //just find missing num
        List<Integer> ans= new ArrayList<>();
        for(int index = 0;index<arr.length;index++)
        {
            if(arr[index]!= index+1)
            {
               ans.add(index+1) ;
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}