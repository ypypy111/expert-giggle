package _2014;

import java.util.Scanner;

/*
	 ��������
	������n��С����Χ����һȦ����ʦ��ÿ��С���������ż�����ǹ���Ȼ������������Ϸ��
	
	����ÿ��С���Ѷ����Լ����ǹ���һ������ֱߵĺ��ӡ�
	
	����һ�ַ��Ǻ�ӵ���������ǵĺ�������ʦ����1���ǹ����Ӷ����ż����
	
	�����������������Ϸ��ֱ������С���ѵ��ǹ�������ͬΪֹ��
	
	�������������Ԥ������֪�ĳ�ʼ�ǹ������£���ʦһ����Ҫ�������ٸ��ǹ���
	�����ʽ
	�����������ȶ���һ������N(2<N<100)����ʾС���ѵ�������
	����������һ���ÿո�ֿ���N��ż����ÿ��ż��������1000����С��2��
	�����ʽ
	����Ҫ��������һ����������ʾ��ʦ��Ҫ�������ǹ�����
	��������
	3
	2 2 4
	�������
	4

 */
public class _05���ǹ� {

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
