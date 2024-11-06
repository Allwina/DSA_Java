import java.util.*;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the num");
        int num =in.nextInt();
        System.out.println(isArmstrong(num));
        System.out.println("Armstrong number between 100 & 1000");
        for(int i=100;i<1000;i++)
        {
            if(isArmstrong(i))
            {
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n)
    {
        int a, sum=0;
        int org=n;
        while(n>0){
            a=n%10;
            sum=sum+a*a*a;
            n=n/10;
        }
        if(org==sum)
        return true;
        else
        return false;
       

    }
}