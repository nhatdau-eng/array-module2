import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);
        System.out.print ( " Nhap kich thuoc cua ma tran vuong ( n * n ) :");
        int size = scanner.nextInt();

        double[][] matrix  = new double[size][size];
        System.out.println ( " Nhap so phan tu cho ma tran : ");
        for ( int i = 0 ; i < size ; i++){
            for ( int j = 0 ; j < size ; i++ ){ 
                 System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        double digonalSum = 0 ; 
        for (int i = 0 ; i < size ; i ++ ){ 
            digonalSum += matrix[i][i];
        }
        System.out.println(" \n Tong cac phan tu tren duong cheo chinh la : "+ digonalSum );
        scanner.close();
     }
}