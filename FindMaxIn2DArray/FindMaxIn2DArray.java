package FindMaxIn2DArray;

import java.util.Scanner;
public class FindMaxIn2DArray {
    public static void main(String[] args){
    Scanner scanner = new Scanner ( System.in);

    System.out.print("nhap so hang ma tran :");
    int rows = scanner.nextInt();
    System.out.print("nhap so cot ma tran :");
    int cols = scanner.nextInt();

    double[][]matrix = new double[rows][cols];

    System.out.print("Nhap cac phan tu cho ma tran : "); 
    for(int i = 0 ; i < rows ; i++){
        for ( int j= 0 ; j < cols ; j++){
            System.out.print("Matrix["+ i + " ]["+ j +"] = ");
            matrix[i][j] =scanner .nextDouble(); 

        }
    }
    double maxValue  = matrix[0][0];
    int maxRow = 0 ; 
    int maxCol = 0 ;

    for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
    System.out.println("\nPhan tu lon nhat la: " + maxValue);
        System.out.println("Toa do cua no o dong  " + maxRow + ", cot " + maxCol);
        
        scanner.close();
    }
}


