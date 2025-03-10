import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi bất kì từ bàn phím: ");
        String word = sc.nextLine();
        StringBuilder w = new StringBuilder(word);
        w.reverse();
        System.out.println("chuỗi sau khi đảo ngược: "+w);
    }
}
