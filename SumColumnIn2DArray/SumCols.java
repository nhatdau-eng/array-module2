import java.util.Scanner;
public class SumCols {
    public static void main(String[] args){
        Scanner scanner = new Scanner ( System.in);
        System.out.print("Nhap so hang cua ma tran:"); 
        int rows = scanner.nextInt();
        System.out.print("Nhao so cot cua ma tran :");
        int cols = scanner.nextInt();
        double [][] matrix = new double[rows][cols];

    System.out.println("Nhập các phần tử cho ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        

        System.out.print("Nhap so thu tu cot ma ban muon tinh tong (tu 0 đen " + (cols - 1) + "): ");
        int colIndex = scanner.nextInt();

        if (colIndex < 0 || colIndex >= cols) {
            System.out.println("Cot khong hop le !");
        } else {
          
            double sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][colIndex];
            }
            
            System.out.println("Tong cac phan tu cua cot"  + colIndex + "la : " + sum);
        }
        
        scanner.close();
    }
}