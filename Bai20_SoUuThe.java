import java.util.Scanner;

public class Bai20_SoUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();

            boolean valid = true;
            int chan = 0;
            int le = 0;

            if (n.charAt(0) == '0') {
                valid = false;
            }

            for (int i = 0; i < n.length(); i++) {
                char c = n.charAt(i);

                if (c < '0' || c > '9') {
                    valid = false;
                    break;
                }

                if ((c - '0') % 2 == 0) {
                    chan++;
                } else {
                    le++;
                }
            }

            if (!valid) {
                System.out.println("INVALID");
            } else if (n.length() % 2 == 0 && chan > le) {
                System.out.println("YES");
            } else if (n.length() % 2 != 0 && le > chan) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
