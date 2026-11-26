import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class KhachHang implements Comparable<KhachHang> {
    private static int counter = 1;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String maKH;
    private String tenKH;
    private String soPhong;
    private long soNgayO;
    private long thanhTien;

    public KhachHang(String tenKH, String soPhong, String ngayNhanStr, String ngayTraStr, long tienDichVu) {
        this.maKH = String.format("KH%02d", counter++);
        this.tenKH = tenKH;
        this.soPhong = soPhong;

        LocalDate ngayNhan = LocalDate.parse(ngayNhanStr, FORMATTER);
        LocalDate ngayTra = LocalDate.parse(ngayTraStr, FORMATTER);
        this.soNgayO = ChronoUnit.DAYS.between(ngayNhan, ngayTra) + 1;

        long donGia = layDonGiaTheoTang(soPhong.charAt(0));
        this.thanhTien = donGia * this.soNgayO + tienDichVu;
    }

    private long layDonGiaTheoTang(char tang) {
        switch (tang) {
            case '1':
                return 25;
            case '2':
                return 34;
            case '3':
                return 50;
            case '4':
                return 80;
            default:
                return 0;
        }
    }

    @Override
    public int compareTo(KhachHang other) {
        return Long.compare(other.thanhTien, this.thanhTien);
    }

    @Override
    public String toString() {
        return maKH + " " + tenKH + " " + soPhong + " " + soNgayO + " " + thanhTien;
    }
}

public class Bai33_HoaDonKhachSan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<KhachHang> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String tenKH = sc.nextLine().trim();
            String soPhong = sc.nextLine().trim();
            String ngayNhan = sc.nextLine().trim();
            String ngayTra = sc.nextLine().trim();
            long tienDichVu = Long.parseLong(sc.nextLine().trim());

            ds.add(new KhachHang(tenKH, soPhong, ngayNhan, ngayTra, tienDichVu));
        }

        Collections.sort(ds);

        for (KhachHang kh : ds) {
            System.out.println(kh);
        }
        sc.close();
    }
}