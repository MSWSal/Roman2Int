import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter Roman");
        String roma = scan.nextLine();
        Roman rm = new Roman();
        rm.romanToInt(roma);

        scan.close();
    }
}
