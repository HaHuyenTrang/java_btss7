import java.util.Random;
import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài chuỗi (1 ≤ n ≤ 1000): ");
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int type = random.nextInt(3); // Chọn ngẫu nhiên 3 loại: 0 (chữ hoa), 1 (chữ thường), 2 (số)
            if (type == 0) {
                sb.append((char) ('A' + random.nextInt(26))); // Chữ cái in hoa A-Z
            } else if (type == 1) {
                sb.append((char) ('a' + random.nextInt(26))); // Chữ cái in thường a-z
            } else {
                sb.append((char) ('0' + random.nextInt(10))); // Chữ số 0-9
            }
        }

        System.out.println("Chuỗi ngẫu nhiên: " + sb.toString());
        }
}
