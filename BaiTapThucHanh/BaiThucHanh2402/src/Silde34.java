import java.util.Scanner;
import java.lang.Math;

public class Silde34 {
    public static void main(String[] args) throws Exception {
        float a, b, c;
        double denta;
        double x1 = 0, x2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a:");
        a = sc.nextFloat();
        System.out.println("nhap so b:");
        b = sc.nextFloat();
        System.out.println("nhap so c:");
        c = sc.nextFloat();
        denta = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phuong trinh vo so nghiem");
                } else {
                    System.out.println("phuong trinh vo nghiem");
                }
            } else {
                x1 = -c / b;
                x2 = x1;
            }
        } else {
            if (denta > 0) {
                x1 = (-b + Math.sqrt(denta)) / (2 * a);
                x2 = (-b - Math.sqrt(denta)) / (2 * a);
            } else if (denta == 0) {
                x1 = -b / (2 * a);
                x2 = x1;
            } else if (denta < 0) {
                System.out.println("phuong trinh vo nghiem");
                return;
            }
            System.out.println("nghiem cua pt la: x1 = " + x1 + " va x2 = " + x2);
        }

    }

}
