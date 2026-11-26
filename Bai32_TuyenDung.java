import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class ThiSinh implements Comparable<ThiSinh> {
    private static int counter = 1;

    private String maTS;
    private String hoTen;
    private double diemTB;
    private String xepLoai;

    public ThiSinh(String hoTen, String rawLyThuyet, String rawThucHanh) {
        this.maTS = String.format("TS%02d", counter++);
        this.hoTen = hoTen;

        double lyThuyet = chuanHoaDiem(rawLyThuyet);
        double thucHanh = chuanHoaDiem(rawThucHanh);
        this.diemTB = (lyThuyet + thucHanh) / 2.0;
        this.xepLoai = tinhXepLoai(this.diemTB);
    }

    private double chuanHoaDiem(String raw) {
        double val = Double.parseDouble(raw);
        if (val > 10.0) {
            // Ví dụ 78 -> 7.8 (hoặc chia 10 cho đến khi <= 10)
            while (val > 10.0) {
                val /= 10.0;
            }
        }
        return val;
    }

    private String tinhXepLoai(double dtb) {
        if (dtb < 5.0) {
            return "TRUOT";
        } else if (dtb < 8.0) {
            return "CAN NHAC";
        } else if (dtb <= 9.5) {
            return "DAT";
        } else {
            return "XUAT SAC";
        }
    }

    public double getDiemTB() {
        return diemTB;
    }

    @Override
    public int compareTo(ThiSinh other) {
        return Double.compare(other.diemTB, this.diemTB);
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%s %s %.2f %s", maTS, hoTen, diemTB, xepLoai);
    }
}

public class Bai32_TuyenDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<ThiSinh> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine().trim();
            String lyThuyet = sc.nextLine().trim();
            String thucHanh = sc.nextLine().trim();

            ds.add(new ThiSinh(hoTen, lyThuyet, thucHanh));
        }

        Collections.sort(ds);

        for (ThiSinh ts : ds) {
            System.out.println(ts);
        }
        sc.close();
    }
}