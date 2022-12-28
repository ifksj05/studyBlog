package programmers;

class Solution {
	public String solution(String s) {
		// 목적 JadenCase -> 단어의 첫 글자를 대문자로 표기하는 방식으로 단어를 변환하시오.

		// 1. 단어를 자른다.
		String[] arr = s.split(" ");

		// 2. 단어의 첫 글자가 아스키 코드 소문자 구간이라면 대문자로 변환한다. 32 차이남
		String answer = "";
		for (int i = 0; i < arr.length; i++) {
			
			
			if ('a' <= arr[i].charAt(0) && arr[i].charAt(0) <= 'z') {
				
				// 첫 글자를 대문자로 바꾸고 뒤 글자를 붙여줌.
				answer += String.valueOf((char) (arr[i].charAt(0) - 32)) + arr[i].substring(1, arr[i].length());
				
				if (i != arr.length)
					answer += " ";
			} else {
				answer += arr[i];
				if (i != arr.length)
					answer += " ";
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("3people unFollowed me"));
	}

}
