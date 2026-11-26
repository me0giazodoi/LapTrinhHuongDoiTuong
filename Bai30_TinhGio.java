import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class GameThu implements Comparable<GameThu> {
    private String ma;
    private String ten;
    private int tongPhut;

    public GameThu(String ma, String ten, String gioVao, String gioRa) {
        this.ma = ma;
        this.ten = ten;
        this.tongPhut = tinhSoPhut(gioVao, gioRa);
    }

    private int quyDoiPhut(String hhmm) {
        String[] parts = hhmm.split(":");
        int gio = Integer.parseInt(parts[0]);
        int phut = Integer.parseInt(parts[1]);
        return gio * 60 + phut;
    }

    private int tinhSoPhut(String gioVao, String gioRa) {
        int vao = quyDoiPhut(gioVao);
        int ra = quyDoiPhut(gioRa);
        if (ra < vao) {
            ra += 24 * 60;
        }
        return ra - vao;
    }

    public int getTongPhut() {
        return tongPhut;
    }

    @Override
    public int compareTo(GameThu other) {
        return Integer.compare(other.tongPhut, this.tongPhut);
    }

    @Override
    public String toString() {
        int gio = tongPhut / 60;
        int phut = tongPhut % 60;
        return ma + " " + ten + " " + gio + " gio " + phut + " phut";
    }
}

public class Bai30_TinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<GameThu> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String gioVao = sc.nextLine().trim();
            String gioRa = sc.nextLine().trim();

            ds.add(new GameThu(ma, ten, gioVao, gioRa));
        }

        Collections.sort(ds);

        for (GameThu gt : ds) {
            System.out.println(gt);
        }
        sc.close();
    }
}