package programmers;

class Solution {
	public String solution(String s) {

		// 목적
		// 문자열 숫자 중 최대 최소 값을 출력한다.

		// 1. 문자열을 나눈다.
		String[] stArr = s.split(" ");

		// 2. 최대 최소 값을 구한다.
		int max = Integer.parseInt(stArr[0]), min = Integer.parseInt(stArr[0]);
		for (int i = 0; i < stArr.length; i++) {
			if (max < Integer.parseInt(stArr[i])) {
				max = Integer.parseInt(stArr[i]);
			}
			if (min > Integer.parseInt(stArr[i])) {
				min = Integer.parseInt(stArr[i]);
			}
		}

		String answer = min + " " + max;
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();

		System.out.println(s.solution("-1 -2 -3 -4"));
	}

}
