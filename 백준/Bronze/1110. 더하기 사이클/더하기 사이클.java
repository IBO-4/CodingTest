import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		
		int N2 = N1;
		int count = 0;
		
		while (true) {
			int left = N2/10;
			int right = N2%10;
			
			N2=(right*10) + ((left+right)%10);
			count++;
			
			if (N2 == N1) {
				break;
			}

		}
		
		System.out.println(count);

	}

}