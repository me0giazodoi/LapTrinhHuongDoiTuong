import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai9_TinhTong {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            long sum = 0;

            while (sc.hasNext()) {
                String token = sc.next();
                try {
                    sum += Integer.parseInt(token);
                } catch (NumberFormatException e) {
                    // Bỏ qua nếu token là chữ hoặc số vượt quá giới hạn kiểu int
                }
            }

            System.out.println(sum);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}