import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Bai10_SoKhacNhauTrongFileVanBan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("DATA.in"));
        int[] cnt = new int[1005];
        String line;

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                int x = Integer.parseInt(st.nextToken());
                if (x >= 0 && x < 1000) {
                    cnt[x]++;
                }
            }
        }

        for (int i = 0; i < 1000; i++) {
            if (cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
            }
        }

        br.close();
    }
}