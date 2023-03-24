package _2013;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 
 * @author ASUS 小数点后保留100位，精确的黄金分割数
 *         1、化为斐波那契数列相邻两项的比值，越多越精确，n/n+1项，这个比值的小数点后101位是稳定的，也就是不变的
 *         2.double无法表示100位小数所以需要使用BigInteger和BigDecimal
 */
public class _04黄金连分数 {

	public static void main(String[] args) {
		BigInteger aBigInteger = BigInteger.ONE;
		BigInteger bBigInteger = BigInteger.ONE;
		
		for (int i = 3; i < 500; i++) {
			BigInteger t = bBigInteger;
			bBigInteger = aBigInteger.add(bBigInteger);
			aBigInteger = t;
		}
		BigDecimal divide = new BigDecimal(aBigInteger,110).divide(new BigDecimal(bBigInteger,110),BigDecimal.ROUND_HALF_DOWN);
		System.out.println(divide.toPlainString().substring(0,103));
	}
//0.6180339887
//	4989484820
//	4586834365
//	6381177203
//	0917980576
//	2862135448
//	6227052604
//	6281890244
//	9707207204
//	1893911374
//	8

}
