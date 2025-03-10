public class bai6 {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("hello");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            word.append(" World");
        }
        long end = System.currentTimeMillis();
        System.out.println("Thời gian với StringBuilder: " + (end - start) + " ms");
        System.out.println(word);
    }
}
