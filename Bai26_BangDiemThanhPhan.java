import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class BangDiem implements Comparable<BangDiem> {
    private String maSV;
    private String hoTen;
    private String lop;
    private double d1;
    private double d2;
    private double d3;

    public BangDiem(String maSV, String hoTen, String lop, double d1, double d2, double d3) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public int compareTo(BangDiem other) {
        return this.maSV.compareTo(other.maSV);
    }

    public String toLine(int stt) {
        return String.format(Locale.US, "%d %s %s %s %.1f %.1f %.1f",
                stt, maSV, hoTen, lop, d1, d2, d3);
    }
}

public class Bai26_BangDiemThanhPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<BangDiem> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String maSV = sc.nextLine().trim();
            String hoTen = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            double d1 = Double.parseDouble(sc.nextLine().trim());
            double d2 = Double.parseDouble(sc.nextLine().trim());
            double d3 = Double.parseDouble(sc.nextLine().trim());

            ds.add(new BangDiem(maSV, hoTen, lop, d1, d2, d3));
        }

        Collections.sort(ds);

        for (int i = 0; i < ds.size(); i++) {
            System.out.println(ds.get(i).toLine(i + 1));
        }
        sc.close();
    }
}