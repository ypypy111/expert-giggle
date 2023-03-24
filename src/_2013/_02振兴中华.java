package _2013;


/**
 * 
 * @author ASUS
 *	从我做起振
 *	我做起振兴
 *	做起振兴中
 *	起振兴中华
 *	
 *	起始位置在从那里，最终要输出：从我做起振兴中华，有多少种情况
 *	用到递归
 */
public class _02振兴中华 {

	public static void main(String[] args) {
		int result = f(0,0);
		System.out.println(result);
	}

	private static int f(int i, int j) {
		if (i == 3 && j == 4) {
			return 1;
		}
		if (i > 3 || j > 4) {
			return 0;
		}
		return f(i+1,j) + f(i,j+1);		// 将两种走法的路线数相加
	}

}
