import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai2_ChuanHoaXauHoTen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine().trim().toLowerCase();
            String[] words = s.split("\\s+");

            for (int i = 0; i < words.length; i++) {
                if (i > 0) sb.append(" ");

                sb.append(Character.toUpperCase(words[i].charAt(0)));
                sb.append(words[i].substring(1));
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
