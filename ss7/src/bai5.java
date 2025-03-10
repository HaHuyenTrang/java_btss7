import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi từ bàn phím: ");
        String word = sc.nextLine();
        word = word.trim();
        String[] words = word.split(" ");
        System.out.println(word);
        StringBuilder w = new StringBuilder();
        for (String ws : words) {
            StringBuilder rev = new StringBuilder(ws);
            rev.reverse(); // Đảo ngược từng từ
            w.append(rev).append(" "); // Ghép từ đã đảo ngược vào kết quả
        }
        System.out.println("chuỗi sau khi ghép và đảo ngược: "+w.toString());

    }
}
