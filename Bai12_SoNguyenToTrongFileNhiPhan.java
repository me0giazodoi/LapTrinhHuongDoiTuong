import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Bai12_SoNguyenToTrongFileNhiPhan {
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

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sieve();

        ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("SONGUYEN.in"))
        );
        @SuppressWarnings("unchecked")
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ois.close();

        int[] count = new int[10000];
        for (int x : list) {
            if (x >= 2 && x < 10000 && !notPrime[x]) {
                count[x]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < 10000; i++) {
            if (count[i] > 0) {
                sb.append(i).append(' ').append(count[i]).append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}