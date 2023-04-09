import java.util.*;

public class lec10Array {
    public static void main(String args[]) {
        System.out.println("enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("enter the arrauy element");

        for (int i = 0; i < n; i++) {

            marks[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");

        }
        System.out.println();
        System.out.println("element you have to search");
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (marks[i] == x) {
                System.out.println("the index of linear search element is ");
                System.out.println(i);
                break;
            } else {
                continue;
            }
        }

    }

}
