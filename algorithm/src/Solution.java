
class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		// 목적 participant에서 completion값들을 제외한 값을 리턴한다.

		// completion값이 participant에 있다면 출력하지 않고 없다면 출력한다.
		for (int i = 0; i < participant.length; i++) {

			boolean complet = false;

			for (int j = 0; j < completion.length; j++) {
				if (participant[i].equals(completion[j])) // completion있다면 true를 반환
					complet = true;

//				System.out.println(complet);
			}

			if (complet) // 완주자 라면 넘기기
				continue;

			answer += participant[i] + " ";

		}

		return answer;
	}

	public static void main(String[] args) {
		Solution sl = new Solution();

		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" }, completion = { "josipa", "filipa", "marina", "nikola" };

		System.out.println(sl.solution(participant, completion));

	}

}