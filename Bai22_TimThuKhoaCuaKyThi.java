import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ThiSinh {
    private static int counter = 1;

    private int maTS;
    private String ten;
    private String ngaySinh;
    private double tongDiem;

    public ThiSinh(String ten, String ngaySinh, double d1, double d2, double d3) {
        this.maTS = counter++;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.tongDiem = d1 + d2 + d3;
    }

    public double getTongDiem() {
        return tongDiem;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %.1f", maTS, ten, ngaySinh, tongDiem);
    }
}

public class Bai22_TimThuKhoaCuaKyThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<ThiSinh> ds = new ArrayList<>();
        double maxDiem = -1;

        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine().trim();
            String ngaySinh = sc.nextLine().trim();
            double d1 = Double.parseDouble(sc.nextLine().trim());
            double d2 = Double.parseDouble(sc.nextLine().trim());
            double d3 = Double.parseDouble(sc.nextLine().trim());

            ThiSinh ts = new ThiSinh(ten, ngaySinh, d1, d2, d3);
            ds.add(ts);
            if (ts.getTongDiem() > maxDiem) {
                maxDiem = ts.getTongDiem();
            }
        }

        for (ThiSinh ts : ds) {
            if (Math.abs(ts.getTongDiem() - maxDiem) < 1e-6) {
                System.out.println(ts);
            }
        }
        sc.close();
    }
}