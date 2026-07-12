import java.util.Scanner;
public class InsertElement {
    public static void main(String[] args){
        int[] numbers = {10, 4, 6, 7, 8, 0, 0, 0};
        Scanner scanner = new Scanner (System.in);
        System.out.print("nhap so can chen X: ");
        int x = scanner.nextInt();
        System.out.print("nhap vi tri can chen (0 đến " + (numbers.length - 1) + "): ");
        int index_chen = scanner.nextInt();
        
        if(index_chen < 0 || index_chen > numbers.length - 1){
            System.out.println("Vi tri index khong hop le , khong can chen!");
        }else{
            for (int i = numbers.length - 1; i >index_chen ;i-- ){
                numbers[i] =numbers[i -1];
            }
            numbers[index_chen] = x;
            System.out.print("Mang sau khi chen :");
            for (int num : numbers){
                System.out.print(num + " ");
            }
            scanner.close();
        }
    }
}
