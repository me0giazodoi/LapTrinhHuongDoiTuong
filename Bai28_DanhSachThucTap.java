import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ThucTap implements Comparable<ThucTap> {
    private static int counter = 1;

    private int stt;
    private String maSV;
    private String hoTen;
    private String lop;
    private String email;
    private String doanhNghiep;

    public ThucTap(String maSV, String hoTen, String lop, String email, String doanhNghiep) {
        this.stt = counter++;
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }

    @Override
    public int compareTo(ThucTap other) {
        return this.hoTen.compareTo(other.hoTen);
    }

    @Override
    public String toString() {
        return stt + " " + maSV + " " + hoTen + " " + lop + " " + email + " " + doanhNghiep;
    }
}

public class Bai28_DanhSachThucTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<ThucTap> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String maSV = sc.nextLine().trim();
            String hoTen = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            String doanhNghiep = sc.nextLine().trim();

            ds.add(new ThucTap(maSV, hoTen, lop, email, doanhNghiep));
        }

        Collections.sort(ds);

        int q = Integer.parseInt(sc.nextLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            String dn = sc.nextLine().trim();
            for (ThucTap tt : ds) {
                if (tt.getDoanhNghiep().equals(dn)) {
                    sb.append(tt).append('\n');
                }
            }
        }

        System.out.print(sb.toString());
        sc.close();
    }
}