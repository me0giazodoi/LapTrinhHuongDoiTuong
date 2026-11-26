import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NhanVien {
    private static int counter = 1;

    private String maNV;
    private String hoTen;
    private long luongThang;
    private long thuong;
    private long phuCap;
    private long thucLinh;

    public NhanVien(String hoTen, long luongNgay, int soNgayCong, String chucVu) {
        this.maNV = String.format("NV%02d", counter++);
        this.hoTen = hoTen;
        this.luongThang = luongNgay * soNgayCong;

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

        this.thucLinh = this.luongThang + this.thuong + this.phuCap;
    }

    public long getThucLinh() {
        return thucLinh;
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + luongThang + " " + thuong + " " + phuCap + " " + thucLinh;
    }
}

public class Bai34_BangKeTienLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<NhanVien> ds = new ArrayList<>();
        long tongChiPhi = 0;

        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine().trim();
            long luongNgay = Long.parseLong(sc.nextLine().trim());
            int soNgayCong = Integer.parseInt(sc.nextLine().trim());
            String chucVu = sc.nextLine().trim();

            NhanVien nv = new NhanVien(hoTen, luongNgay, soNgayCong, chucVu);
            ds.add(nv);
            tongChiPhi += nv.getThucLinh();
        }

        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
        System.out.println("Tong chi phi tien luong: " + tongChiPhi);
        sc.close();
    }
}