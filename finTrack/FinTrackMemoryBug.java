package finTrack;
import java.util.Arrays;

public class FinTrackMemoryBug {
    public static void main(String[] args) {
        System.out.println("========== KHẢO SÁT BIẾN NGUYÊN THỦY ==========");

        int originalPrice = 500;
        int backupPrice = originalPrice; // Sao chép giá trị

        backupPrice = 700;

        System.out.println("Original Price : " + originalPrice);
        System.out.println("Backup Price   : " + backupPrice);
        System.out.println("\n========== MẢNG - HEAP ==========");

        int[] todayRates = {10, 20, 30};
        int[] backupRates = Arrays.copyOf(todayRates, todayRates.length);

        System.out.println("Trước khi thay đổi:");
        System.out.println("Today Rates  : " + Arrays.toString(todayRates));
        System.out.println("Backup Rates : " + Arrays.toString(backupRates));

        backupRates[0] = 99;

        System.out.println("\nSau khi thay đổi backupRates:");
        System.out.println("Today Rates  : " + Arrays.toString(todayRates));
        System.out.println("Backup Rates : " + Arrays.toString(backupRates));
        System.out.println("\n========== NULL POINTER ==========");
        int[] historyRates = new int[3];

        historyRates[0] = 15;
        historyRates[1] = 25;
        historyRates[2] = 35;

        System.out.println("History Rates: " + Arrays.toString(historyRates));
        System.out.println("\n========== PASS-BY-VALUE ==========");

        int[] data = {1, 2, 3};

        System.out.println("Trước khi gọi modifyArray():");
        System.out.println(Arrays.toString(data));

        modifyArray(data);

        System.out.println("Sau khi gọi modifyArray():");
        System.out.println(Arrays.toString(data));
        System.out.println("\n========== THAY ĐỔI THAM CHIẾU ==========");

        int[] anotherData = {5, 6, 7};

        System.out.println("Trước khi gọi reassignArray():");
        System.out.println(Arrays.toString(anotherData));

        reassignArray(anotherData);

        System.out.println("Sau khi gọi reassignArray():");
        System.out.println(Arrays.toString(anotherData));
    }
    public static void modifyArray(int[] arr) {

        System.out.println("\nĐang thực hiện modifyArray()...");

        arr[0] = 999;

        System.out.println("Trong hàm: " + Arrays.toString(arr));
    }
    public static void reassignArray(int[] arr) {

        System.out.println("\nĐang thực hiện reassignArray()...");

        arr = new int[]{100, 200, 300};

        System.out.println("Trong hàm: " + Arrays.toString(arr));
    }
}