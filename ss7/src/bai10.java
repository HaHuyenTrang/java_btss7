import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        StringBuilder word = new StringBuilder(sc.nextLine());

        while (true) {
            // Hiển thị menu
            System.out.println("\n--- MENU ---");
            System.out.println("1. Đảo ngược chuỗi");
            System.out.println("2. Chèn chuỗi vào vị trí bất kỳ");
            System.out.println("3. Xóa một đoạn trong chuỗi");
            System.out.println("4. Thay thế một đoạn trong chuỗi");
            System.out.println("5. Chuyển đổi chữ hoa/chữ thường");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng (1-6): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Đảo ngược chuỗi
                    word.reverse();
                    System.out.println("Chuỗi sau khi đảo ngược: " + word);
                    break;
                case 2: // Chèn chuỗi vào vị trí bất kỳ
                    System.out.print("Nhập vị trí cần chèn: ");
                    int insertPos = sc.nextInt();
                    sc.nextLine();  // Loại bỏ ký tự xuống dòng còn sót lại trong bộ đệm
                    System.out.print("Nhập chuỗi cần chèn: ");
                    String insertStr = sc.nextLine();
                    if (insertPos >= 0 && insertPos <= word.length()) {
                        //.insert(int offset, String str);
                        word.insert(insertPos, insertStr);
                        System.out.println("Chuỗi sau khi chèn: " + word);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 3: // Xóa một đoạn trong chuỗi
                    System.out.print("Nhập vị trí bắt đầu: ");
                    int startDelete = sc.nextInt();
                    System.out.print("Nhập vị trí kết thúc: ");
                    int endDelete = sc.nextInt();
                    sc.nextLine();
                    if (startDelete >= 0 && endDelete <= word.length() && startDelete < endDelete) {
                        word.delete(startDelete, endDelete);
                        System.out.println("Chuỗi sau khi xóa: " + word);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 4: // Thay thế một đoạn trong chuỗi
                    System.out.print("Nhập vị trí bắt đầu: ");
                    int startReplace = sc.nextInt();
                    System.out.print("Nhập vị trí kết thúc: ");
                    int endReplace = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập chuỗi thay thế: ");
                    String replaceStr = sc.nextLine();
                    if (startReplace >= 0 && endReplace <= word.length() && startReplace < endReplace) {
                        word.replace(startReplace, endReplace, replaceStr);
                        System.out.println("Chuỗi sau khi thay thế: " + word);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 5: // Chuyển đổi chữ hoa/chữ thường
                    System.out.print("Nhập 1 để chuyển thành chữ hoa, 2 để chuyển thành chữ thường: ");
                    int cases= sc.nextInt();
                    sc.nextLine();
                    if (cases == 1) {
                        word = new StringBuilder(word.toString().toUpperCase());
                    } else if (cases == 2) {
                        word = new StringBuilder(word.toString().toLowerCase());
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    System.out.println("Chuỗi sau khi chuyển đổi: " + word);
                    break;
                case 6: // Thoát chương trình
                    System.out.println("Thoát chương trình");
                    sc.close();
                    return;
                default:
                    System.out.println(" Vui lòng chọn từ 1 đến 6.");
            }
        }
    }
}
