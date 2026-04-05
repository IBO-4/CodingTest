import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            boolean[] appeared = new boolean[26];

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                appeared[ch - 'A'] = true;
            }

            int totalSum = 0;
            for (int i = 0; i < 26; i++) {
                if (!appeared[i]) {
                    totalSum += (i + 65);
                }
            }

            System.out.println(totalSum);
        }

        sc.close();
    }
}