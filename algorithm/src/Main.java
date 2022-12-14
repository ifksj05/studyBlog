import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	//데이터 처리 구간
	public static String stringWhile(String string, int times) {
		// TODO Auto-generated method stub

		String returnString = "";
		for (int i = 0; i < string.length(); i++) {
			String tmp = "";

			for (int j = 0; j < times; j++) {
				tmp += string.charAt(i);
			}

			returnString += tmp;

		}

		return returnString;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력 구간
		int T = sc.nextInt(); 
		String[][] inputArr = new String[T][2];
		String[] resultArr = new String[T];

		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i][0] = sc.next();
			inputArr[i][1] = sc.next();

		}
		
		// 출력 구간

		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(stringWhile(inputArr[i][1], Integer.parseInt(inputArr[i][0])));
		}

	}

}
