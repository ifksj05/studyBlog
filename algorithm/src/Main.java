import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[28];
		//입력 부분
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//배열 정렬 부분
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i+1] - arr[i] != 1) {
				System.out.println(arr[i] + 1);
			}
		}
		
		
	}
	
}
