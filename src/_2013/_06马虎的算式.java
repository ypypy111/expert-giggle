package _2013;

/**
 * 
 * @author ASUS 马虎的算式
 * 	寻找满足形如ab*cdf = adb*cf的算式，且不含0
 */
public class _06马虎的算式 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 10; i <= 99; i++) {
			int a = i / 10;
			int b = i % 10;
			if (a == b || a == 0 || b == 0) {
				continue;
			}
			for (int j = 100; j <= 999; j++) {
				int c = j / 100;
				int d = j % 100 / 10;
				int e = j % 10;
				if (c == d || d == e || c == e || c == 0 || d == 0 || e == 0) {
					continue;
				}
				if (a == c || a == d || a== e || b == c || b == d || b == e) {
					continue;
				}
				if ((a*10 + b)*(c*100 + d*10 + e) == (a*100 + d*10 + b)*(c*10 + e) ) {
					System.out.println("第" + count++ + "次:" + String.format("%d%d * %d%d%d = %d%d%d * %d%d", a,b, c, d, e, a, d, b, c, e));
				}
				
			}
		}
		System.out.println("有" + count + "组这类的算式。");
//		answer();
		System.out.println("======================================");
		chatGptAnswer();
	}
	
	public static void answer() {
		int a,b,c,d,e;
		int count=0;//记录满足条件的个数
		for(a=1;a<=9;a++)
			for(b=1;b<=9;b++)
				for(c=1;c<=9;c++)
					for(d=1;d<=9;d++)
						for(e=1;e<=9;e++){//abcde代表1-9各不同的5个数字	 
							if(a!=b&&a!=c&&a!=d&&a!=e&&b!=c&&b!=d&&b!=e
									&&c!=d&&c!=e&&d!=e){
								int sum1=(a*10+b)*(c*100+d*10+e);
								int sum2=(a*100+d*10+b)*(c*10+e);
								if(sum1==sum2) {
									count++;
								}
							}
						}
		System.out.println(count);
	}
	public static void chatGptAnswer() {
		int count = 0;
		for (int a = 1; a <= 9; a++) {
		    for (int b = 1; b <= 9; b++) {
		        if (a == b) {
		            continue;
		        }
		        for (int c = 1; c <= 9; c++) {
		            if (a == c || b == c) {
		                continue;
		            }
		            for (int d = 1; d <= 9; d++) {
		                if (a == d || b == d || c == d) {
		                    continue;
		                }
		                for (int e = 1; e <= 9; e++) {
		                    if (a == e || b == e || c == e || d == e) {
		                        continue;
		                    }
		                    int left = a * 10 + b;
		                    int right = a * 100 + d * 10 + b;
		                    int result = left * (c * 100 + d * 10 + e);
		                    if (result == right * (c * 10 + e)) {
		                        System.out.println(String.format("%d%d * %d%d%d = %d%d%d * %d%d", a,b, c, d, e, a, d, b, c, e));
		                        count++;
		                    }
		                }
		            }
		        }
		    }
		}
		System.out.println("有" + count + "组这类的算式。");
	}

}