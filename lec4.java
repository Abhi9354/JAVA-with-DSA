import java.net.SocketTimeoutException;
import java.util.*;

public class lec4 {
    public static void main(String args[]) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*\t");

            }
            System.out.println();
        }
    }
}

/*
 * 2.hollow Rectangle
 * int n = 4;
 * int m = 5;
 * for (int i = 1; i <= n; i++) {
 * for (int j = 1; j <= m; j++) {
 * if (i == 1 || j == 1 || i == n || j == m) {
 * System.out.print("*");
 * } else {
 * System.out.print(" ");
 * }
 * }
 * System.out.println();
 * }
 * 
 * }
 * }
 */

/*
 * 3. half pyramid
 * int n = 4;
 * for (int i = 1; i <= n; i++) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * 
 * }
 * }
 */

/*
 * 3.Inverted pyramid
 * int n = 4;
 * for (int i = n; i >= 1; i--) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * 
 * }
 * }
 */

/*
 * 4. Inverted pyramid rotated 180
 * int n = 4;
 * for (int i = 1; i <= n; i++) {
 * for (int j = 1; j <= n - i; j++) {
 * System.out.print(" ");
 * }
 * for (int j = 1; j <= i; j++) {
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * 
 * }
 * }
 */

/*
 * 6.half pyramid with number
 * int n = 5;
 * for (int i = 1; i <= n; i++) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print(j + " ");
 * }
 * System.out.println();
 * }
 * 
 * }
 * }
 */

/*
 * 7.Inverted pyramid with number
 * int n = 5;
 * for (int i = n; i >= 1; i--) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print(j);
 * }
 * System.out.println();
 * }
 * 
 * }
 * }
 */

/*
 * 8. Flyod's Triangle
 * int n = 5;
 * int num = 1;
 * for (int i = 1; i <= n; i++) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print(num + " ");
 * num++;
 * }
 * System.out.println();
 * }
 * 
 * }
 * }
 */

/*
 * 9.0,1 triangle
 * int n = 5;
 * int num = 1;
 * for (int i = 1; i <= n; i++) {
 * for (int j = 1; j <= i; j++) {
 * if ((i + j) % 2 == 0) {
 * System.out.print(num);
 * } else {
 * System.out.print(num - 1);
 * }
 * 
 * }
 * System.out.println();
 * }
 * }
 * }
 */