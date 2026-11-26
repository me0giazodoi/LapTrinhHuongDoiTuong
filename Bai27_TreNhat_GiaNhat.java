import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Nguoi implements Comparable<Nguoi> {
    private String ten;
    private String ngaySinh;

    public Nguoi(String ten, String ngaySinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    public String getTen() {
        return ten;
    }

    private String getSortKey() {
        // Chuyển dd/mm/yyyy thành yyyymmdd để so sánh từ già nhất đến trẻ nhất
        String[] parts = ngaySinh.split("/");
        return parts[2] + parts[1] + parts[0];
    }

    @Override
    public int compareTo(Nguoi other) {
        return this.getSortKey().compareTo(other.getSortKey());
    }
}

public class Bai27_TreNhat_GiaNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<Nguoi> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+");
            ds.add(new Nguoi(parts[0], parts[1]));
        }

        Collections.sort(ds);

        // Sau khi sắp xếp tăng dần theo ngày sinh: phần tử cuối là trẻ nhất, phần tử đầu là già nhất
        System.out.println(ds.get(ds.size() - 1).getTen());
        System.out.println(ds.get(0).getTen());
        sc.close();
    }
}