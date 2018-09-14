import java.util.Scanner;


public class Task5 {
    public static void main(String[] args){
        int[] array = {1,2,3};
        for(int i = 0; i < array.length; i++){
            Repeat repeat = new Repeat(array[i]);
            System.out.print(" ");
            System.out.print(array[i] + " ");
            System.out.print(repeat.copy());
        }
    }
}
