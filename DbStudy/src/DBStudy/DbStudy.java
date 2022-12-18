package DBStudy;

import java.util.Scanner;




public class DbStudy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("디비를 생성할까요 ? (y or n): ");
		if ("n".equals(sc.next()))
			System.exit(0);
		new DbCreate();
		System.out.println();

		System.out.print("테이블을 생성할까요 ? (y or n): ");
		if ("n".equals(sc.next()))
			System.exit(0);
		new TableCreate();
		System.out.println();

		System.out.print("데이터를 추가할까요 ? (y or n): ");
		if ("n".equals(sc.next()))
			System.exit(0);
		new DbDataInsert();
		System.out.println();
	}
}
