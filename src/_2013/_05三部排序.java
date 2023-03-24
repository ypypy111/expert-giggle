package _2013;

public class _05三部排序 {

	static void sort(int[] x) {
		int p = 0;
		int left = 0; // 下标
		int right = x.length - 1; // 最大下标

		while (p <= right) {
			if (x[p] < 0) {
				// 元素小于0，将元素和left位置交换
				int t = x[left];
				x[left] = x[p];
				x[p] = t;

				left++;
				p++;
			} else if (x[p] > 0) {
				// 元素大于0，将元素和right位置交换
				int t = x[right];
				x[right] = x[p];
				x[p] = t;
				right--;
			} else {
				// 元素等于0
				p++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 25, 18, -2, 0, 16, -5, 33, 21, 0, 19, -16, -25, -3, 0 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
