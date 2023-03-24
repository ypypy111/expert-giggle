package _2014;

import java.util.Scanner;

/*
	 问题描述
	　　有n个小朋友围坐成一圈。老师给每个小朋友随机发偶数个糖果，然后进行下面的游戏：
	
	　　每个小朋友都把自己的糖果分一半给左手边的孩子。
	
	　　一轮分糖后，拥有奇数颗糖的孩子由老师补给1个糖果，从而变成偶数。
	
	　　反复进行这个游戏，直到所有小朋友的糖果数都相同为止。
	
	　　你的任务是预测在已知的初始糖果情形下，老师一共需要补发多少个糖果。
	输入格式
	　　程序首先读入一个整数N(2<N<100)，表示小朋友的人数。
	　　接着是一行用空格分开的N个偶数（每个偶数不大于1000，不小于2）
	输出格式
	　　要求程序输出一个整数，表示老师需要补发的糖果数。
	样例输入
	3
	2 2 4
	样例输出
	4

 */
public class _05分糖果 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();			
		}
		sc.close();
		int ans = 0;
		while(true) {
			int t = a[0];
			for (int i = 0; i <= n - 2; i++) {
				a[i] -= a[i]/2;
				a[i] += a[i+1]/2;
				if ((a[i] & 1) == 1) {
					ans++;
					a[i]++;					
				}
			}
			a[n-1] -= a[n-1] / 2;
			a[n-1] += t / 2;
			if ((a[n-1] & 1) == 1) {
				ans++;
				a[n-1]++;
			}
			if (check(a,n)) {
				System.out.println(ans);
				return;
			}
		}
	}
	
	private static boolean check(int[] a,int n) {
		int t = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] != t) {
				return false;
			}
		}
		return true;
	}

}
