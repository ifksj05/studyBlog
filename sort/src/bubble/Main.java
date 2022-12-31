package bubble;

public class Main {
	public static void main(String[] args) {

		int[] nums = { 10, 7, 8, 3, 5, 7 };

		for (int i = nums.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}

		// 모든 수를 비교해야 하기 떄문에 당연히 느릴 수 밖에 없다. -> 하지만 단순하여 제작 속도가 빠르다.

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}