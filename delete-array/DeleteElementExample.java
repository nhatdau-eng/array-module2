import java.util.Scanner;
public class DeleteElementExample {
    public static void main(String[] args){
        int[] numbers = {10, 4, 6, 7, 8, 6};
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap phan tu can xoa X :");
        int x = scanner.nextInt();

        int index_del = -1 ;
        for(int i = 0 ; i < numbers.length; i++){
            if(numbers[i]== x){
                index_del = i ;
                break ;
            }
        }
        if(index_del != -1){
            System.out.println("Tim thay vi tri cua "+ x +"tai index:"+ index_del);

            for(int i = index_del ; i < numbers.length - 1 ; i++){
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1 ] = 0 ;
            System.out.print("Mang sau khi xoa:");
            for(int num : numbers){
                System.out.print(num +" ");
            }
        }else{
            System.out.println("phan tu "+ x +"khong ton tai trong mang.");
        }
        scanner.close();
    }
}
