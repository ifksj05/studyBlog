import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("실행");

		Scanner sc = new Scanner(System.in); // abc
		String s = sc.next();
		int[] result = new int[26];

		Arrays.fill(result, -1); // -1 채우기

		for (int i = 0; i < s.length(); i++) {
			result[s.charAt(i) - 97] = i;
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}
}