package _2014;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/*
	问题描述
	　　小明先把硬币摆成了一个 n 行 m 列的矩阵。
	
	　　随后，小明对每一个硬币分别进行一次 Q 操作。
	
	　　对第x行第y列的硬币进行 Q 操作的定义：将所有第 i*x 行，第 j*y 列的硬币进行翻转。
	
	　　其中i和j为任意使操作可行的正整数，行号和列号都是从1开始。
	
	　　当小明对所有硬币都进行了一次 Q 操作后，他发现了一个奇迹——所有硬币均为正面朝上。
	
	　　小明想知道最开始有多少枚硬币是反面朝上的。于是，他向他的好朋友小M寻求帮助。
	
	　　聪明的小M告诉小明，只需要对所有硬币再进行一次Q操作，即可恢复到最开始的状态。然而小明很懒，不愿意照做。于是小明希望你给出他更好的方法。帮他计算出答案。
	输入格式
	　　输入数据包含一行，两个正整数 n m，含义见题目描述。
	输出格式
	　　输出一个正整数，表示最开始有多少枚硬币是反面朝上的。
	样例输入
	2 3
	样例输出
	1
	数据规模和约定
	　　对于10%的数据，n、m <= 10^3；
	　　对于20%的数据，n、m <= 10^7；
	　　对于40%的数据，n、m <= 10^15；
	　　对于10%的数据，n、m <= 10^1000（10的1000次方）
 */
public class _06矩阵翻硬币 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		System.out.println(sqrt(s1).multiply(sqrt(s2))); //大数的乘法
	}

	private static BigInteger sqrt(String s) {
		int length = s.length();
		int len = 0;
		//求开方的结果的整数的长度
		if (length%2==0) {
			len = length/2;
		}else {
			len = length/2+1;
		}
		
		//定义一个字符数组用来存放开方结果
		char[] sArr = new char[len];
		//给数组初始化为0
		Arrays.fill(sArr, '0');

		BigInteger target = new BigInteger(s); //把字符串转为大数类型，作为比较目标
		
		//对开方结果进行试探
		for (int pos = 0; pos < sArr.length; pos++) {
			for (char c = '1'; c <= '9'; c++) {
				sArr[pos] = c; //在pos这个位置上试着填入1-9
				BigInteger pow = new BigInteger(String.valueOf(sArr)).pow(2); //字符数组转为字符串，然后转为大数类型，最后平方
				if (pow.compareTo(target) == 1) { //试探数的平方比目标大
					sArr[pos]-=1; //pos位置上的数-1
					break; //跳出循环
				}
			}
		}
		
		return new BigInteger(String.valueOf(sArr));
	}
	
}
