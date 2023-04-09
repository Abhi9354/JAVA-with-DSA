import java.util.*;

public class lec2 {
    public static void main(String[] args) {

        int a = 4;
        int b = 4;
        int sum = a + b;
        System.out.println("the sum of a and b is ");
        System.out.println(sum);
        System.out.println("type the string");
        Scanner Word = new Scanner(System.in);

        String name = Word.nextLine();
        System.out.println("string is printed");
        System.out.println(name);
        System.out.println("the input value of x and y ");
        Scanner first = new Scanner(System.in);
        int x = first.nextInt();

        int y = first.nextInt();
        System.out.println("the sum of x and y is");
        System.out.println(x + y);

    }

}
