package _2013;

import java.util.Calendar;

// 01世纪末的星期
/**
 * Java 选手请务必不要使用 package 语句，并且确保自己的主类名称为 Main，否则会导致评测系统运行时找不到主类而得 0 分。 Java
 * 选手如果程序中引用了类库，在提交时必须将 import 语句与程序的其他部分同时提交。只允许使用 Java 自带的类库. /
 * 
 * 
 * /* 标题:世纪末的星期 曾有邪教称1999年12月31日是世界末日。当然该谣言已经不攻自破。
 * 还有人称今后的某个世纪末的12月31日，如果是星期一则会.... 有趣的是，任何一个世纪末的年份的12月31日都不可能是星期一!!
 * 于是，“谣言制造商”又修改为星期日.... . .
 * 1999年的12月31日是星期五，请问:未来哪一个离我们最近的一个世纪未年（即xx99年)的12月31日正好是星期天（即星期日）？
 * 请回答该年份(只写这个4位整数，不要写12月31等多余信息)
 */
public class _01世纪末的星期 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		for (int year = 1999; year < 10000; year += 100) {
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, 11); // 12月
			calendar.set(Calendar.DAY_OF_MONTH, 31);
			System.out.println(year + " " + calendar.get(Calendar.DAY_OF_WEEK));
			if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
				System.out.println(year);
				break;
			}
		}
	}
}
