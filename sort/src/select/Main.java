package select;

public class Main {
	public static void main(String[] args) {

		int[] nums = { 10, 7, 8, 3, 5, 7 };

		for (int i = 0; i < nums.length - 1; i++) {
			int MinIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[MinIndex] > nums[j])
					MinIndex = j;
			}
			int temp = nums[MinIndex];
			nums[MinIndex] = nums[i];
			nums[i] = temp;
		}
		
		// 버블 정렬은 비교 후 양 값을 교체 해야 하기 때문에 더 오래 걸린다.
		// 하지만 선택 정렬은 작은 값을 찾는다 -> 값을 바꾼다
		// 이기 때문에 좀 더 적게 걸린다.
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
