package _2014;

/*
  	����:����ĸ
	��abcd.. .s��19����ĸ��ɵ������ظ�ƴ��106�Σ��õ�����Ϊ2014�Ĵ���
	������ɾ����1����ĸ(����ͷ����ĸa)���Լ���3������5������������λ�õ���ĸ��
	�õ����´��ٽ���ɾ������λ����ĸ�Ķ����������ȥ�����ֻʣ��һ����ĸ����д������ĸ��
	����һ��Сд��ĸ����ͨ��������ύ�𰸡���Ҫ��д�κζ�������ݡ�

 */
public class _01����ĸ {

	public static void main(String[] args) {
		char[] list = new char[2014];
		
		int k = 0;
		for (int i = 0; i < 106; i++) {
			for (int j = 0; j < 19; j++) {
				list[k++] = (char)('a' + j);
			}
		}
//		for (int i = 0; i < list.length; i++) {
//			System.out.print(list[i]);
//		}
		int len = 2014;
		while(len != 1) {
			int t = 0;
			for (int i = 1; i < len; i += 2) {
				list[t++] = list[i];
			}
			len = t;
		}
		System.out.println(list[0]);
	}

}
