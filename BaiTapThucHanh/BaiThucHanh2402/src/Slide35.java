import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) throws Exception {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a:");
        a = sc.nextInt();
        System.out.println("nhap so b:");
        b = sc.nextInt();
        if (a > b) {
            System.out.println("So nho hon la: " + b);
        } else if (a < b) {
            System.out.println("So nho hon la: " + a);
        } else {
            System.out.println("Hai so bang nhau");

        }

    }
}
