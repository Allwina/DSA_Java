import java.util.*;
public class OutputString
{
    public static void main(String[] args)
    {
        System.out.println(56);
        //System.out.println(new int[]{1,2,3});
        float a=453.12754f;
        System.out.printf("%.2f",a);
        System.out.println();
        System.out.println(Math.PI);
        System.out.printf("My name is %s and I am %s \n","Allwina","cool");
       //ASCII value addded
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        System.out.println("a"+10);
        System.out.println("Allwina"+ new ArrayList<>());
        System.out.println("Allwina" + new Integer(56));
        //won't work as + acan be used for concatemnation between primitives or one among them must be a String
       // System.out.println(new Integer(56)+new ArrayList<>());
       String ans=new Integer(56)+ "" +new ArrayList<>();
       System.out.println(ans);

    }
}