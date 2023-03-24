package _2014;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/*
	��������
	����С���Ȱ�Ӳ�Ұڳ���һ�� n �� m �еľ���
	
	�������С����ÿһ��Ӳ�ҷֱ����һ�� Q ������
	
	�����Ե�x�е�y�е�Ӳ�ҽ��� Q �����Ķ��壺�����е� i*x �У��� j*y �е�Ӳ�ҽ��з�ת��
	
	��������i��jΪ����ʹ�������е����������кź��кŶ��Ǵ�1��ʼ��
	
	������С��������Ӳ�Ҷ�������һ�� Q ��������������һ���漣��������Ӳ�Ҿ�Ϊ���泯�ϡ�
	
	����С����֪���ʼ�ж���öӲ���Ƿ��泯�ϵġ����ǣ��������ĺ�����СMѰ�������
	
	����������СM����С����ֻ��Ҫ������Ӳ���ٽ���һ��Q���������ɻָ����ʼ��״̬��Ȼ��С����������Ը������������С��ϣ������������õķ���������������𰸡�
	�����ʽ
	�����������ݰ���һ�У����������� n m���������Ŀ������
	�����ʽ
	�������һ������������ʾ�ʼ�ж���öӲ���Ƿ��泯�ϵġ�
	��������
	2 3
	�������
	1
	���ݹ�ģ��Լ��
	��������10%�����ݣ�n��m <= 10^3��
	��������20%�����ݣ�n��m <= 10^7��
	��������40%�����ݣ�n��m <= 10^15��
	��������10%�����ݣ�n��m <= 10^1000��10��1000�η���
 */
public class _06����Ӳ�� {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		System.out.println(sqrt(s1).multiply(sqrt(s2))); //�����ĳ˷�
	}

	private static BigInteger sqrt(String s) {
		int length = s.length();
		int len = 0;
		//�󿪷��Ľ���������ĳ���
		if (length%2==0) {
			len = length/2;
		}else {
			len = length/2+1;
		}
		
		//����һ���ַ�����������ſ������
		char[] sArr = new char[len];
		//�������ʼ��Ϊ0
		Arrays.fill(sArr, '0');

		BigInteger target = new BigInteger(s); //���ַ���תΪ�������ͣ���Ϊ�Ƚ�Ŀ��
		
		//�Կ������������̽
		for (int pos = 0; pos < sArr.length; pos++) {
			for (char c = '1'; c <= '9'; c++) {
				sArr[pos] = c; //��pos���λ������������1-9
				BigInteger pow = new BigInteger(String.valueOf(sArr)).pow(2); //�ַ�����תΪ�ַ�����Ȼ��תΪ�������ͣ����ƽ��
				if (pow.compareTo(target) == 1) { //��̽����ƽ����Ŀ���
					sArr[pos]-=1; //posλ���ϵ���-1
					break; //����ѭ��
				}
			}
		}
		
		return new BigInteger(String.valueOf(sArr));
	}
	
}
