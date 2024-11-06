import java.util.*;
public class Prime{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the num to be checked");
        int num=in.nextInt();
       System.out.println(isPrime(num));
    }
   static boolean isPrime(int n){
    if(n<=1)
    {
        return false;
    }
     int c=2;
     while(c*c <=n){
        if(n%c==0){
            return false;
        }
        c++;
     }
     if(c*c>n){
        return true;
         }
         return false;
     }
   }
