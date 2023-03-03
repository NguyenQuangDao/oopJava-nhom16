public class Slide55 {
    public static void main(String[] args) throws Exception {
        System.out.println("các số chia hết cho 5 từ 0 đến 200 là:");
        for (int i = 0; i <= 200; i++) {
            if (i % 5 == 0)
                System.out.print(i + " ");
        }
    }
}
