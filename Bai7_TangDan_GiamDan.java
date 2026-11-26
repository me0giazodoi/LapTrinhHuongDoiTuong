import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;

public class Bai7_TangDan_GiamDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            TreeSet<Integer> chan = new TreeSet<>();
            TreeSet<Integer> le = new TreeSet<>(Collections.reverseOrder());

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 2 == 0) {
                    chan.add(x);
                } else {
                    le.add(x);
                }
            }

            for (int x : chan) {
                System.out.print(x + " ");
            }
            System.out.println();

            for (int x : le) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
