import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Bai13_SoNguyenToTrongHaiFileNhiPhan {
    static boolean[] notPrime = new boolean[10000];

    static void sieve() {
        notPrime[0] = true;
        notPrime[1] = true;
        for (int i = 2; i * i < 10000; i++) {
            if (!notPrime[i]) {
                for (int j = i * i; j < 10000; j += i) {
                    notPrime[j] = true;
                }
            }
        }
    }

    static int[] countPrimes(String fileName) throws IOException, ClassNotFoundException {
        int[] cnt = new int[10000];
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(fileName)))) {
            @SuppressWarnings("unchecked")
            ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
            for (int x : list) {
                if (x >= 2 && x < 10000 && !notPrime[x]) {
                    cnt[x]++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sieve();

        int[] cnt1 = countPrimes("DATA1.in");
        int[] cnt2 = countPrimes("DATA2.in");

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < 10000; i++) {
            if (cnt1[i] > 0 && cnt2[i] > 0) {
                sb.append(i).append(' ')
                  .append(cnt1[i]).append(' ')
                  .append(cnt2[i]).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}