package _2013;


/**
 * 
 * @author ASUS
 *	����������
 *	����������
 *	����������
 *	�������л�
 *	
 *	��ʼλ���ڴ��������Ҫ������������������л����ж��������
 *	�õ��ݹ�
 */
public class _02�����л� {

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
		return f(i+1,j) + f(i,j+1);		// �������߷���·�������
	}

}
