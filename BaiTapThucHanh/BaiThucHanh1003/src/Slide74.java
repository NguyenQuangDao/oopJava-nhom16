import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) throws Exception {
        int ktm, sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap so luong phan tu trong mang ( phai lon hon 0):");
            ktm = sc.nextInt();
        } while (ktm <= 0);
        int arr[] = new int[ktm];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("nhap phan tu thu %d = ", i);
            int a = sc.nextInt();
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // kiểm tra số chẵn
                sum += arr[i]; // cộng vào tổng
            }
        }
        System.out.println("Tổng các số chẵn trong mảng: " + sum);
    }
}
