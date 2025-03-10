import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi từ bàn phím: ");
        String word = sc.nextLine();
        word = word.toLowerCase();
        StringBuilder w = new StringBuilder(word);
        w.reverse();
        if(word.equals(w.toString())){
            System.out.println("chuỗi đối xứng");
        }else{
            System.out.println("chuỗi không đối xứng");
        }
    }
}
