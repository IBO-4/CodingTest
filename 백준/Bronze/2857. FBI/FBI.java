import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean found = false;
        
        for (int i = 1; i <= 5; i++) {
            String name = sc.nextLine();
            
            if (name.contains("FBI")) {
                System.out.print(i + " ");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("HE GOT AWAY!");
        }
        
        sc.close();
    }
}