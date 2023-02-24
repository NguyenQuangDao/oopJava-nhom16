import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) throws Exception {
        int a, phanDu;
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 so tu ban phim:");
        a = sc.nextInt();
        while (a <= 0) {
            System.out.println("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
            a = sc.nextInt();
        }
        while (a > 0) {
            phanDu = a % 10;
            tong += phanDu;
            a /= 10;
        }
        System.out.println("tong cac chu so là: " + tong);
    }
}
