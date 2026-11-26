import java.io.*;
import java.util.*;

public class Bai1_SapXepDaySo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] count = new int[10001];

            int dem = 0;

            while (dem < n) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                while (st.hasMoreTokens()) {
                    int x = Integer.parseInt(st.nextToken());
                    count[x]++;
                    dem++;
                }
            }

            boolean first = true;

            for (int i = 0; i <= 10000; i++) {
                while (count[i] > 0) {
                    if (!first) sb.append(" ");
                    sb.append(i);
                    first = false;
                    count[i]--;
                }
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
