import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số ngày trong tuần (1 đến 7): ");
        int dayOfWeek = scanner.nextInt();
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Chủ nhật";
                break;
            case 2:
                dayName = "Thứ hai";
                break;
            case 3:
                dayName = "Thứ ba";
                break;
            case 4:
                dayName = "Thứ tư";
                break;
            case 5:
                dayName = "Thứ năm";
                break;
            case 6:
                dayName = "Thứ sáu";
                break;
            case 7:
                dayName = "Thứ bảy";
                break;
            default:
                dayName = "Số nhập vào không hợp lệ!";
                break;
        }

        System.out.println("Ngày " + dayOfWeek + " là " + dayName + ".");
    }
}
