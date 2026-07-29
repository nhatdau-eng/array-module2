import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = "chao mung ban den voi lap trình java codegym";
        System.out.println("Chuoi ban dau la : " + str);
        System.out.print("Nhap vao ki tu ma ban muon dem so lan xuat hien : ");
        char targetChar = scanner.next().charAt(0); 
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++; 
            }
        }
        System.out.println("Ky tu '" + targetChar + "' xuat hien" + count + " lan trong chuoi.");
        
        scanner.close();
    }
}