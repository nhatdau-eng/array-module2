import java.util.Scanner;
public class MinValueInArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner ( System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int size = scanner.nextInt();
        int []arr = new int[size];

        System.out.println("Nhap cac phan tu cua mang:");
        for(int i = 0 ; i < size ; i++){
            System.out.print("arr[" + i + "]= ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int minIndex = 0 ;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("\n phan tu co gia tri nho nhat trong mang la:" + min);
        System.out.println("Nam tai vi tri index:"+ minIndex);
        scanner.close();
    }
}
