import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int ktm;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap so luong phan tu trong mang ( phai lon hon 0):");
            ktm = sc.nextInt();
        } while (ktm <= 0);
        int arrA[] = new int[ktm];
        for (int i = 0; i < arrA.length; i++) {
            System.out.printf("nhap phan tu thu %d = ", i);
            int a = sc.nextInt();
            arrA[i] = a;
        }
        for (int i = 0; i < arrA.length - 1; i++) {
            int tam;
            for (int j = i + 1; j < arrA.length; j++) {
                if (arrA[i] > arrA[j]) {
                    tam = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = tam;
                }
            }
        }
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
    }
}
