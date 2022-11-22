import java.util.Scanner;

public class Main {

	private static boolean hansooDiscriminant(int num) {
		// TODO Auto-generated method stub
		boolean returnThis = false;

		String stnum = num + "";
		String[] stnumArr = stnum.split("");
		int[] intnumArr = new int[stnumArr.length];
		for (int i = 0; i < intnumArr.length; i++) {
//			intnumArr[i] = (int)stnumArr[i] ;
			intnumArr[i] = Integer.parseInt(stnumArr[i]);
		}

		if (stnumArr.length == 1) { // 1자리인 경우 무조건 등차수열
			returnThis = true;

		} else { // 2자리 ~ n자리 숫자
			if (intnumArr[1] - intnumArr[0] > 0) { // 증가중
				for (int i = 0; i < stnumArr.length - 1; i++) {
					int numDifference = intnumArr[i + 1] - intnumArr[i];

				}

			} else if (intnumArr[1] - intnumArr[0] < 0) { // 감소중
				for (int i = 0; i < stnumArr.length - 1; i++) {
					int numDifference = intnumArr[i + 1] - intnumArr[i];

				}
			}

//			for (int i = 0; i < stnumArr.length - 1; i++) {
//				int numDifference = intnumArr[i + 1] - intnumArr[i];
//
//				
//
//			}

		}

		return returnThis;
	}

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int num = sc.nextInt();
		int resurt = 0;

		for (int i = 1; i <= num; i++) {
			if (hansooDiscriminant(i)) {
				resurt += 1;
			}
		}

		System.out.println("결괏값 : " + resurt);

	}

}
