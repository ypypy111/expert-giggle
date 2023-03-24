package _2015;

/*
 题目

立方变自身

观察下面的现象,某个数字的立方，按位累加仍然等于自身。
1^3 = 1
8^3 = 512 5+1+2=8
17^3 = 4913 4+9+1+3=17
…

请你计算包括1,8,17在内，符合这个性质的正整数一共有多少个？

请填写该数字，不要填写任何多余的内容或说明性的文字。

答案是 6
 */
public class _01立方变自身 {

	public static void main(String[] args) {
		int ans = 0;
		for (int i = 1; i < 100; i++) {
			int i3 = i*i*i;
			int sum = sumOfW(i3);
			if (sum == i) {
				ans++;
				System.out.println(ans + " " + i + " " + i3);
			}
		}
		System.out.println(ans);
	}

	private static int sumOfW(int x) {
		int n = 0;
		int sum = 0;
		int t = x;
		while(x > 0) {
			x /= 10;
			n++;
		}
		for (int i = 0; i < n; i++) {
			sum += t % 10;
			t /= 10;
		}
		return sum;
	}
}
