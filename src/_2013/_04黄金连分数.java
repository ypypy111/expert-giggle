package _2013;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 
 * @author ASUS С�������100λ����ȷ�Ļƽ�ָ���
 *         1����Ϊ쳲�����������������ı�ֵ��Խ��Խ��ȷ��n/n+1������ֵ��С�����101λ���ȶ��ģ�Ҳ���ǲ����
 *         2.double�޷���ʾ100λС��������Ҫʹ��BigInteger��BigDecimal
 */
public class _04�ƽ������� {

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
