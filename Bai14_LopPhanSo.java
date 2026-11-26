import java.util.Scanner;

class PhanSo {
    private long tu;
    private long mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public void rutGon() {
        long g = gcd(tu, mau);
        tu /= g;
        mau /= g;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}

public class Bai14_LopPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();

        PhanSo ps = new PhanSo(tu, mau);
        ps.rutGon();
        System.out.println(ps);
        sc.close();
    }
}