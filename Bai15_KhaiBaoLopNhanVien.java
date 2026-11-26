import java.util.Scanner;

class NhanVien {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHD;

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh,
                    String diaChi, String maSoThue, String ngayKyHD) {
        this.maNV = "00001";
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

public class Bai15_KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine().trim();
        String gioiTinh = sc.nextLine().trim();
        String ngaySinh = sc.nextLine().trim();
        String diaChi = sc.nextLine().trim();
        String maSoThue = sc.nextLine().trim();
        String ngayKyHD = sc.nextLine().trim();

        NhanVien nv = new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHD);
        System.out.println(nv);
        sc.close();
    }
}