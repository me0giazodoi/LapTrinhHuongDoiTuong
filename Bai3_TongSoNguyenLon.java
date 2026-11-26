import java.util.Scanner;

public class Bai3_TongSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            String x = sc.next();
            String y = sc.next();

            int i = x.length() - 1;
            int j = y.length() - 1;
            int carry = 0;

            StringBuilder sum = new StringBuilder();

            while (i >= 0 || j >= 0 || carry > 0) {
                int a = i >= 0 ? x.charAt(i--) - '0' : 0;
                int b = j >= 0 ? y.charAt(j--) - '0' : 0;

                int s = a + b + carry;
                sum.append(s % 10);
                carry = s / 10;
            }

            result.append(sum.reverse()).append('\n');
        }

        System.out.print(result);
        sc.close();
    }
}