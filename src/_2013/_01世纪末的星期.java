package _2013;

import java.util.Calendar;

// 01����ĩ������
/**
 * Java ѡ������ز�Ҫʹ�� package ��䣬����ȷ���Լ�����������Ϊ Main������ᵼ������ϵͳ����ʱ�Ҳ���������� 0 �֡� Java
 * ѡ�������������������⣬���ύʱ���뽫 import �����������������ͬʱ�ύ��ֻ����ʹ�� Java �Դ������. /
 * 
 * 
 * /* ����:����ĩ������ ����а�̳�1999��12��31��������ĩ�ա���Ȼ��ҥ���Ѿ��������ơ�
 * �����˳ƽ���ĳ������ĩ��12��31�գ����������һ���.... ��Ȥ���ǣ��κ�һ������ĩ����ݵ�12��31�ն�������������һ!!
 * ���ǣ���ҥ�������̡����޸�Ϊ������.... . .
 * 1999���12��31���������壬����:δ����һ�������������һ������δ�꣨��xx99��)��12��31�������������죨�������գ���
 * ��ش�����(ֻд���4λ��������Ҫд12��31�ȶ�����Ϣ)
 */
public class _01����ĩ������ {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		for (int year = 1999; year < 10000; year += 100) {
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, 11); // 12��
			calendar.set(Calendar.DAY_OF_MONTH, 31);
			System.out.println(year + " " + calendar.get(Calendar.DAY_OF_WEEK));
			if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
				System.out.println(year);
				break;
			}
		}
	}
}
