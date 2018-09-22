package hello;
import java.util.Scanner;
public class hello {
	public static void main(String[] args) {
		System.out.println("한자리 숫자를 입력 하세요:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number < 2) {
			System.out.println("1보다 큰 수를 입력 하세요!!");
		}
		else if (number > 9) {
			System.out.println("10보다 작은 수를 입력 하세요!!");
		}
		else {
			for (int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}
	}
	
}
