import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NhanVien {
    private static int counter = 1;

    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHD;

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh,
                    String diaChi, String maSoThue, String ngayKyHD) {
        this.maNV = String.format("%05d", counter++);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKyHD = ngayKyHD;
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + gioiTinh + " " + ngaySinh
                + " " + diaChi + " " + maSoThue + " " + ngayKyHD;
    }
}

public class Bai17_DanhSachNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<NhanVien> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine().trim();
            String gioiTinh = sc.nextLine().trim();
            String ngaySinh = sc.nextLine().trim();
            String diaChi = sc.nextLine().trim();
            String maSoThue = sc.nextLine().trim();
            String ngayKyHD = sc.nextLine().trim();

            ds.add(new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHD));
        }

        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
        sc.close();
    }
}