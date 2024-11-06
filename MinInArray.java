import java.util.*;
class MinInArray{
    public static void main(String args[])
    {
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
        System.out.println("The minimum num is " +min(ar));
    }
    static int min(int[] arr)
    {
        int minimum =arr[0];
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]<minimum){
            minimum=arr[i];
          }
        }
        return minimum;

    }
}