import java.util.*;
public class Linear{
    public static void main(String args[]){
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of array");
        n=in.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            ar[i]=in.nextInt();
        }
        System.out.println("Enter the target");
        int target=in.nextInt();
        int result=linearSearch(ar,target);
        if(result==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at : "+result);
        }
    }
    //search in the array: return index if found else -1
    static  int linearSearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
           return -1; 
        }
        else
        {
            for(int index=0;index<arr.length;index++)
            {
                if(arr[index]==target)
                {
                    return index;
                }     
            }
        }
        return -1;
       
    }
}