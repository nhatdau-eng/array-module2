import java.util.Arrays;
public class mergeArrays {
    public static void main(String[]agrs){
        int [] array1 = {1,2,3};
        int [] array2 = {4,5,6,7};

        int [] array3 = new int[array1.length + array2.length];
        
        int index = 0; 
        for( int i = 0 ; i < array1.length ; i ++ ){
            array3 [index] = array1 [i]; 
            index ++ ; 
        }
        for ( int i = 0 ; i < array2.length ; i++ ){
            array3[index] = array2[i];
            index++;
        }
        System.out.println("Mang sau khi gop "+ Arrays.toString(array3));
    }
}