import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class HoaDon implements Comparable<HoaDon> {
    private String maMH;
    private String tenMH;
    private long soLuong;
    private long donGia;
    private long chietKhau;
    private long tongTien;

    public HoaDon(String maMH, String tenMH, long soLuong, long donGia, long chietKhau) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.tongTien = donGia * soLuong - chietKhau;
    }

    @Override
    public int compareTo(HoaDon other) {
        return Long.compare(other.tongTien, this.tongTien);
    }

    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + soLuong + " " + donGia + " " + chietKhau + " " + tongTien;
    }
}

public class Bai31_TinhTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<HoaDon> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String maMH = sc.nextLine().trim();
            String tenMH = sc.nextLine().trim();
            long soLuong = Long.parseLong(sc.nextLine().trim());
            long donGia = Long.parseLong(sc.nextLine().trim());
            long chietKhau = Long.parseLong(sc.nextLine().trim());

            ds.add(new HoaDon(maMH, tenMH, soLuong, donGia, chietKhau));
        }

        Collections.sort(ds);

        for (HoaDon hd : ds) {
            System.out.println(hd);
        }
        sc.close();
    }
}