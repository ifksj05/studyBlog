package guiSnail;

import java.util.Iterator;
import java.util.Scanner;

public class TestClass {
	
	//데이터 처리 구간
	public static String stringWhile(InputData data) {
		// TODO Auto-generated method stub

		String returnString = "";
		for (int i = 0; i < data.getMsg().length(); i++) {
			String tmp = "";

			for (int j = 0; j < data.getCnt(); j++) {
				tmp += data.getMsg().charAt(i);
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

		
		InputData[] data = new InputData[T];

		for (int i = 0; i < inputArr.length; i++) {
			data[i] = new InputData(sc.nextInt(), sc.next());
		}
		
		// 출력 구간
		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(stringWhile(data[i]));
		}

	}

}

class InputData{
	private int cnt;
	private String msg;
	
	public InputData(int cnt, String msg) {
		super();
		this.cnt = cnt;
		this.msg = msg;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}	
}