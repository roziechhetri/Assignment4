import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int n1 = display(a);
        System.out.println(n1);
    }

    public static int display(int[] array) {
        Arrays.sort(array);
        int n = array[array.length - 1] - array[0];
        int b = array.length;
        if (b == 1) {
            n = array[0];
        }
        return n;
    }
}