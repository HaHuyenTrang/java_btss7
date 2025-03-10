import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi a: ");
        String a = sc.nextLine();
        System.out.println("nhập chuỗi b: ");
        String b = sc.nextLine();
        System.out.println("nhập chuỗi c: ");
        String c = sc.nextLine();

        StringBuilder d = new StringBuilder("");
        d.append(a+b+c);
        System.out.println("chuỗi vừa nối: "+d);
        d.toString().toUpperCase();
        System.out.println(d);


    }
}
