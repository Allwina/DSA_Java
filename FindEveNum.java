import java.util.*;
public class FindEveNum
{
    public static void main(String[] args)
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
        System.out.println(findNumbers(ar));
    }
    static int findNumbers(int[] nums)
    {
      int count=0;
      for(int num:nums)  
      {
        if(even(num))
        {
            count++;
        }
      }
      return count;
    }
    // func to check whether a num contains even digits or not
    static boolean even(int num)
    {
      int numOfDigits=digits(num);
      if(numOfDigits %2==0)
      {
        return true;
      }
      return false;
    }
    //count num of digits
    static int digits(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        return count;

    }
}