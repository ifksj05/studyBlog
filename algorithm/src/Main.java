import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[][] paper = new boolean[100][100];
		int colorPaperNum = sc.nextInt();
		int result = 0;

		for (int i = 0; i < colorPaperNum; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int j = x; j < x + 10; j++) {
				for (int j2 = y; j2 < y + 10; j2++) {

					if (!paper[j][j2]) {
						paper[j][j2] = true;
						result += 1;
					}
				}

			}

		}

		System.out.println(result);

	}
}