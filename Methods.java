import java.util.*;

public class Methods {
    public int sum() {
        Scanner in = new Scanner(System.in);  // Scanner opened
        System.out.println("Enter num1");
        int num1 = in.nextInt();
        System.out.println("Enter num2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        in.close();  // Close Scanner to avoid resource leak
        return sum;
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        int k = m.sum();
        System.out.println("The sum is " + k);
    }
}
