import java.util.Arrays;
import java.util.Scanner;

public class Bai23_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        String[] ten = new String[n];
        String[] nhom = new String[n];
        double[] loiNhuan = new double[n];
        Integer[] idx = new Integer[n];

        for (int i = 0; i < n; i++) {
            ten[i] = sc.nextLine().trim();
            nhom[i] = sc.nextLine().trim();
            double giaMua = Double.parseDouble(sc.nextLine().trim());
            double giaBan = Double.parseDouble(sc.nextLine().trim());
            loiNhuan[i] = giaBan - giaMua;
            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) -> {
            int cmp = Double.compare(loiNhuan[b], loiNhuan[a]);
            return cmp != 0 ? cmp : Integer.compare(a, b);
        });

        StringBuilder sb = new StringBuilder();
        for (int i : idx) {
            sb.append(i + 1).append(' ')
              .append(ten[i]).append(' ')
              .append(nhom[i]).append(' ')
              .append(String.format("%.2f", loiNhuan[i])).append('\n');
        }
        System.out.print(sb.toString());
        sc.close();
    }
}