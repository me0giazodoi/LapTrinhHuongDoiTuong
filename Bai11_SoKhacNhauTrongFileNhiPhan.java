import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Bai11_SoKhacNhauTrongFileNhiPhan {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] count = new int[1000];

        for (int i = 0; i < 100000; i++) {
            count[dis.readInt()]++;
        }

        for (int i = 0; i < 1000; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }

        dis.close();
    }
}