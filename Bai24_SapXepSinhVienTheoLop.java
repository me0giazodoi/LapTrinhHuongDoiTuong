import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien> {
    private String maSV;
    private String hoTen;
    private String lop;
    private String email;

    public SinhVien(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien other) {
        int cmpLop = this.lop.compareTo(other.lop);
        if (cmpLop != 0) {
            return cmpLop;
        }
        return this.maSV.compareTo(other.maSV);
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + lop + " " + email;
    }
}

public class Bai24_SapXepSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<SinhVien> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String maSV = sc.nextLine().trim();
            String hoTen = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();

            ds.add(new SinhVien(maSV, hoTen, lop, email));
        }

        Collections.sort(ds);

        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
        sc.close();
    }
}