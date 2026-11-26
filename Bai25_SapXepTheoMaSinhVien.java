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
        return this.maSV.compareTo(other.maSV);
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + lop + " " + email;
    }
}

public class Bai25_SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> ds = new ArrayList<>();

        while (sc.hasNextLine()) {
            String maSV = sc.nextLine().trim();
            if (maSV.isEmpty()) {
                continue;
            }
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