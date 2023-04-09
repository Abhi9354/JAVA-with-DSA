import java.util.*;

public class lec3 {
    public static void main(String args[]) {
        System.out.println("enter the two input");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a > b) {
            System.out.println("the input 1 is greater");
        }
        if (a < b) {
            System.out.println("b is greater than a ");
        } else if (a == b) {
            System.out.println("both are equal");
        }

    }

}
