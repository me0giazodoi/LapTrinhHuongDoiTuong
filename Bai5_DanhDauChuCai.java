
import java.util.Scanner;
import java.util.HashSet;

public class Bai5_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        System.out.println(set.size());

        sc.close();
    }
}
