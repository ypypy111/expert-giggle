package _2013;

/**
 * 
 * @author ASUS
 * 	有理數
 *	有理數是指两个整数的比值，为了保证精确，我们使用两个整数的比值的形式进行加法和乘法运算
 */
public class _03有理數 {
	public static void main(String[] args) {
		Rational a = new Rational(1, 3);
		Rational b = new Rational(1, 6);
		Rational c = a.add(b);
		System.out.println(a + "+" + b + "=" + c);

	}
	static class Rational{
		private long ra;
		private long rb;
		private long gcd(long a, long b) {
			if (b == 0) {
				return a;
			}
			return gcd(b, a%b);
		}
		public Rational(long a, long b) {
			ra = a;
			rb = b;
			long k = gcd(ra, rb);
			if (k > 1) {	// 需要约分
				ra /= k;
				rb /= k;
			}
		}
		
		// 加法
		public Rational add(Rational x) {
			return new Rational(this.ra*x.rb + this.rb*x.ra, this.rb*x.rb);
		}
		// 乘法
		public Rational mul(Rational x) {
			return new Rational(ra*x.ra, rb*x.rb);
		}
		
		public String toString() {
			if (rb == 1) {
				return "" + ra;
			}
			return ra + "/" + rb;
		}
	}
	

}
