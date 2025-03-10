import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi PascalCase hoặc camelCase: ");
        String word = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        if (!word.isEmpty()) {
            //Character.isLowerCase(c): Kiểm tra xem ký tự có phải chữ thường không.
            sb.append(Character.toLowerCase(word.charAt(0)));
            //word.charAt(0)Lấy ký tự đầu tiên của chuỗi word.
            for (int i = 1; i < word.length(); i++) {
                char c = word.charAt(i);
                if (Character.isUpperCase(c)) {
                    sb.append("_"); // Thêm dấu gạch dưới trước chữ cái viết hoa
                    sb.append(Character.toLowerCase(c)); // Chuyển thành chữ thường
                } else {
                    sb.append(c); // Giữ nguyên nếu là chữ thường
                }
            }
        }

        System.out.println("Chuỗi: " + sb.toString());
        sc.close();
    }
}
