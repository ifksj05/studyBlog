import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("실행");
		// 목적
		// 두 수를 입력 받아 숫자를 거꾸로 읽어 큰 숫자를 구분한다.

		// 1. 숫자 받기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();

		// 2. 숫자 거꾸로 저장하기
		int setA, setB;
		setA = a / 100 + ((a % 100) / 10) * 10 + (a % 10) * 100;
		setB = b / 100 + ((b % 100) / 10) * 10 + (b % 10) * 100;

		// 3. 숫자 비교하기
		if (setA > setB)System.out.println(setA);
		else System.out.println(setB);

	}
}