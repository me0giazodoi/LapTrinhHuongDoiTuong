import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MatHang {
    private static int counter = 1;

    private String maMH;
    private String tenHang;
    private String donViTinh;
    private long phiVanChuyen;
    private long thanhTien;
    private long giaBan;

    public MatHang(String tenHang, String donViTinh, long donGiaNhap, long soLuong) {
        this.maMH = String.format("MH%02d", counter++);
        this.tenHang = tenHang;
        this.donViTinh = donViTinh;

        long tienHang = donGiaNhap * soLuong;
        this.phiVanChuyen = Math.round(tienHang * 0.05);
        this.thanhTien = Math.round(tienHang + this.phiVanChuyen);
        this.giaBan = Math.round(this.thanhTien * 1.02);
    }

    @Override
    public String toString() {
        return maMH + " " + tenHang + " " + donViTinh + " " + phiVanChuyen + " " + thanhTien + " " + giaBan;
    }
}

public class Bai36_TinhGiaBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<MatHang> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String tenHang = sc.nextLine().trim();
            String donViTinh = sc.nextLine().trim();
            long donGiaNhap = Long.parseLong(sc.nextLine().trim());
            long soLuong = Long.parseLong(sc.nextLine().trim());

            ds.add(new MatHang(tenHang, donViTinh, donGiaNhap, soLuong));
        }

        for (MatHang mh : ds) {
            System.out.println(mh);
        }
        sc.close();
    }
}