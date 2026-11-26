import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class NhanVien implements Comparable<NhanVien> {
    private static int counter = 1;

    private String maNV;
    private String hoTen;
    private long luongThang;
    private long thuong;
    private long phuCap;
    private long thuNhap;

    public NhanVien(String hoTen, long luongCoBan, int soNgayCong, String chucVu) {
        this.maNV = String.format("NV%02d", counter++);
        this.hoTen = hoTen;
        this.luongThang = luongCoBan * soNgayCong;

        if (soNgayCong >= 25) {
            this.thuong = Math.round(this.luongThang * 0.20);
        } else if (soNgayCong >= 22) {
            this.thuong = Math.round(this.luongThang * 0.10);
        } else {
            this.thuong = 0;
        }

        switch (chucVu) {
            case "GD":
                this.phuCap = 250000;
                break;
            case "PGD":
                this.phuCap = 200000;
                break;
            case "TP":
                this.phuCap = 180000;
                break;
            default:
                this.phuCap = 150000;
                break;
        }

        this.thuNhap = this.luongThang + this.thuong + this.phuCap;
    }

    @Override
    public int compareTo(NhanVien other) {
        return Long.compare(other.thuNhap, this.thuNhap);
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + luongThang + " " + thuong + " " + phuCap + " " + thuNhap;
    }
}

public class Bai35_SapXepBangTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<NhanVien> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine().trim();
            long luongCoBan = Long.parseLong(sc.nextLine().trim());
            int soNgayCong = Integer.parseInt(sc.nextLine().trim());
            String chucVu = sc.nextLine().trim();

            ds.add(new NhanVien(hoTen, luongCoBan, soNgayCong, chucVu));
        }

        Collections.sort(ds);

        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
        sc.close();
    }
}