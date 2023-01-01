import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
	public String solution(String[] participant, String[] completion) {

		// 문제 이해
		// participant와 completion값을 비교 participant에 없는 값을 찾아 출력.

		// 1. participant를 넣어 참가자 HashMap을 제작한다.

		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);

		int tmp = 0;
		while (!participant[tmp].equals(completion[tmp++])) {
			answer = participant[tmp-1];
		}
//		
//		HashMap<String, Integer> names = new HashMap<>();
//		HashMap<String, Integer> finishNames = new HashMap<>();
//
//		for (String name : participant) {
//			names.put(name, tmp++);
//		}

		return answer;
	}

	public static void main(String[] args) {
		Solution sl = new Solution();

		String[] participant = { "leo", "kiki", "eden" }, completion = { "eden", "kiki" };

		System.out.println(sl.solution(participant, completion));

	}

}