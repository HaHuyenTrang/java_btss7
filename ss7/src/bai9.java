import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String word = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int count = 1; // Biến đếm số lần xuất hiện liên tiếp của ký tự

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++; // Nếu ký tự giống ký tự trước, tăng biến đếm
            } else {
                sb.append(word.charAt(i - 1)).append(count); // Ghi ký tự + số lần xuất hiện
                count = 1; // Reset biến đếm
            }
        }

        System.out.println("Chuỗi đã nén: " + sb.toString());
    }
}
