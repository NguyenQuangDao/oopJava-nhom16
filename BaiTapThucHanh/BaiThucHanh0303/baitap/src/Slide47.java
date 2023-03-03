import java.util.Scanner;
public class Slide47 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Bạn hãy nhập một số nguyên: ");
            num = scanner.nextInt();
            sum += num;
        } while (sum <= 100);

        System.out.println("Tổng của các số mà bạn đã nhập là " + sum );
    }
}
