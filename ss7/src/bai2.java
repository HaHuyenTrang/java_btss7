public class bai2 {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder( "Hello, Java World!");
        System.out.println(word);
        word.delete(5,9);
        System.out.println("chuỗi sau khi xóa từ 5 đến 9: "+word);
        word.replace(9,13, "Universe");
        System.out.println("chuỗi sau khi thay thế: "+word);
    }
}
