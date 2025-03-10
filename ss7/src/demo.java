public class demo {
    public static void main(String[] args) {
        //1 khai báo chuỗi
        StringBuilder ra = new StringBuilder("rikkei academy");
        ra.append("học viện đào tạo CNTT");
        System.out.println("kết quả nối chuỗi: "+ra);
        ra.insert(7,"education");
        System.out.println("kết quả sau khi chèn: "+ra);
        ra.replace(7 ,    17 , "");
        System.out.println("kết quả sau khi thay thế: "+ra);
        ra.delete(7 , 17);
        System.out.println("kết quả sau khi xóa: "+ra);
        ra.reverse();
        System.out.println("chuỗi sau khi reverse: "+ra);
    }
}
