import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String gioiTinh;
    private String lop;
    private String email;
    private String soDienThoai;

    public SinhVien(String maSV, String hoTen, String gioiTinh,
                    String lop, String email, String soDienThoai) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return maSV + ", " + hoTen + ", " + gioiTinh + ", "
                + lop + ", " + email + ", " + soDienThoai;
    }
}

public class Bai16_KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<SinhVien> danhSach = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String maSV = sc.nextLine().trim();
            String hoTen = sc.nextLine().trim();
            String gioiTinh = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            String soDienThoai = sc.nextLine().trim();

            danhSach.add(new SinhVien(maSV, hoTen, gioiTinh, lop, email, soDienThoai));
        }

        for (SinhVien sv : danhSach) {
            System.out.println(sv);
        }
        sc.close();
    }
}