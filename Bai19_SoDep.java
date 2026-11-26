import java.util.Scanner;

public class Bai19_SoDep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();

            boolean dep = true;

            for (int i = 0; i < n.length(); i++) {
                int x = n.charAt(i) - '0';

                if (x % 2 != 0) {
                    dep = false;
                    break;
                }
            }

            if (dep) {
                for (int i = 0; i < n.length() / 2; i++) {
                    if (n.charAt(i) != n.charAt(n.length() - 1 - i)) {
                        dep = false;
                        break;
                    }
                }
            }

            System.out.println(dep ? "YES" : "NO");
        }

        sc.close();
    }
}
