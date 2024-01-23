
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator b = new Calculator();

        System.out.print("vnesi vrednost za a: ");
        int aValue = scanner.nextInt();
        b.seta(aValue);

        System.out.print("vnesi vrednost za b: ");
        int bValue = scanner.nextInt();
        b.setb(bValue);

        int c = b.geta() + b.getb();

        System.out.println("zbirot od a i b e: " + c);

        
        scanner.close();
    }
}
