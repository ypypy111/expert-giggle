package _2015;

/*
 ��Ŀ

����������

�۲����������,ĳ�����ֵ���������λ�ۼ���Ȼ��������
1^3 = 1
8^3 = 512 5+1+2=8
17^3 = 4913 4+9+1+3=17
��

����������1,8,17���ڣ�����������ʵ�������һ���ж��ٸ���

����д�����֣���Ҫ��д�κζ�������ݻ�˵���Ե����֡�

���� 6
 */
public class _01���������� {

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
