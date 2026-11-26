import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai8_DocFileVanBan {
    public static void main(String[] args) {
        try {
            File file = new File("DATA.in");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}