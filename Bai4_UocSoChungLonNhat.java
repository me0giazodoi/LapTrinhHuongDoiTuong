import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Bai4_UocSoChungLonNhat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            BigInteger a = new BigInteger(br.readLine().trim());
            BigInteger b = new BigInteger(br.readLine().trim());

            sb.append(a.gcd(b)).append("\n");
        }

        System.out.print(sb);
    }
}
