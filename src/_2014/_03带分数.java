package _2014;

import java.util.Scanner;

/*
 	B���9��g
	����:������
	100���Ա�ʾΪ����������ʽ:100- 3 +69258/ 714
	�����Ա�ʾΪ:100= 82 + 3546/ 197
	ע������:�������У�����1~9�ֱ������ֻ����һ��(������0).
	���������Ĵ�������100��11�ֱ�ʾ����
	��ĿҪ��;
	�ӱ�׼�������һ��������N(N<1000*1000)
	�������������������1~9���ظ�����©����ɴ�������ʾ��ȫ��������ע��:��Ҫ�����ÿ����ʾ��ֻͳ���ж��ٱ�ʾ��!
	����:
	�û������100
	�������:11
	������:�û������105
	�������:6
	��ԴԼ��:
		��ֵ�ڴ����ģ��������)<64MCPU����<3000ms
		���ϸ�Ҫ���������Ҫ��������ش�ӡ����:����������...���Ķ������ݡ�
		���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
		ע��:��Ҫʹ��package��䡣��Ҫʹ��jdk1.6�����ϰ汾�����ԡ�ע��:��������ֱ�����:Main��������Ч���봦��
 */
public class _03������ {
	static int ans;
	private static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		f(arr,0);
//		int a = toInt(arr, 0, 2);
//		System.out.println(a);
	}
	// ȷ��ĳһ�����еĵ�kλ
	private static void f(int[] arr,int k) {
		if (k == 9) {	// ȫ��ȷ����
			check(arr);
//			print(arr);
			return;
		}
		// ѡ����kλ
		for (int i = k; i < arr.length; i++) {
			// ����iλ�͵�kλ����
			int t = arr[i];
			arr[i] = arr[k];
			arr[k] = t;
			
			// �ƽ���һ��ȥȷ��k+1λ
			f(arr, k+1);
			
			// ���ݣ���������
			t = arr[i];
			arr[i] = arr[k];
			arr[k] = t;
		}
	}
	
	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	/*
	 * ö�ټӺźͳ��ŵ�λ��
	 */
	private static void check(int[] arr) {
		// +��ǰ���ַ������7
		for (int i = 1; i <= 7; i++) {
			int num1 = toInt(arr,0,i);	// +ǰ���һ������
			if (num1 >= N) { //	�����ʱ+�ŵ������Ѿ�������N��û��Ҫ������
				continue;
			}
			
			// /��ǰ����ַ���
			for (int j = 1; j <= 8-i; j++) {
				int num2 = toInt(arr, i, j);
				int num3 = toInt(arr, i+j, 9-i-j);
				if (num2 % num3 == 0 && num1 + num2 / num3 == N) {
					ans++;
				}
			}
		}
	}
	
	private static int toInt(int[] arr,int pos,int len) {
		int t = 1;
		for (int i = pos + len - 1; i >= pos; i--) {
			ans += arr[i]*t;
			t *= 10;
		}
		return ans;
	}
}








