import java.util.Scanner;

public class TestString {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String array = scan.nextLine();
        array.concat("Prixe");
        System.out.print(array.concat("Pixie"));
    }
}

