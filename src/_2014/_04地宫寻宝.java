package _2014;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.Box.Filler;

/**
题目描述
  X 国王有一个地宫宝库。是 n x m 个格子的矩阵。每个格子放一件宝贝。每个宝贝贴着价值标签。

    地宫的入口在左上角，出口在右下角。

    小明被带到地宫的入口，国王要求他只能向右或向下行走。

    走过某个格子时，如果那个格子中的宝贝价值比小明手中任意宝贝价值都大，小明就可以拿起它（当然，也可以不拿）。

    当小明走到出口时，如果他手中的宝贝恰好是k件，则这些宝贝就可以送给小明。

    请你帮小明算一算，在给定的局面下，他有多少种不同的行动方案能获得这k件宝贝。

【数据格式】

    输入一行3个整数，用空格分开：n m k (1<=n,m<=50, 1<=k<=12)

    接下来有 n 行数据，每行有 m 个整数 Ci (0<=Ci<=12)代表这个格子上的宝物的价值

    要求输出一个整数，表示正好取k个宝贝的行动方案数。该数字可能很大，输出它对 1000000007 取模的结果。

例如，输入：
2 2 2
1 2
2 1
程序应该输出：
2

再例如，输入：
2 3 2
1 2 3
2 1 5
程序应该输出：
14

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 2000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
注意：主类的名字必须是：Main，否则按无效代码处理。
 */
public class _04地宫寻宝 {

	private static long N = 1000000007;
	private static int n, m, k;
	private static int map[][] = new int[50][50];
	private static int dp[][][][] = new int[50][50][15][15];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		k = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = scanner.nextInt();
			}
		}
		// 利用java的API直接将数组初始化，全部值为-1
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				for (int k = 0; k < 15; k++) {
					// 只能将一维数组填满为
					Arrays.fill(dp[i][j][k], -1);
				}
			}
		}

		DFS(0, 0, 0, -1);
		System.out.println(dp[0][0][0][0]); // 起点刚开始什么都没有的状态
	}

	/**
	 * DFS搜寻方法
	 * 
	 * @param x   横坐标
	 * @param y   纵坐标
	 * @param num 手中已有的宝贝数
	 * @param max 手中宝贝最大的价值
	 * @return 返回总路线条数
	 */
	public static int DFS(int x, int y, int num, int max) {
		// 检验该路径是否已经走过了
		if (dp[x][y][num][max + 1] != -1) {
			return dp[x][y][num][max + 1];
		}
		// 到达边界
		if (x == n - 1 && y == m - 1) {
			/**
			 * 到达边界成功的两种情况是 1.手中的数量正好等于题目所要的k，这时不拿会成功 2.当前手中正好差一个地下的宝物大于手中的max，这时也会成功
			 */
			if (num == k || (num == k - 1 && max < map[x][y])) {
				return dp[x][y][num][map[x][y]] = 1;

			} else {
				return dp[x][y][num][max + 1] = 0; // 不满足条件
			}
		}
		/**
		 * 拿和不拿的两种情况 1.手中的max大于地下宝物的价值，此时可拿可不拿 2.手中的max小于地下宝物价值，此时只能不拿
		 */
		long s = 0;
		if (x < n - 1) { // 向下搜索
			if (max < map[x][y]) { // 可拿可不拿，不拿的情况当成不能拿来处理
				s += DFS(x + 1, y, num + 1, map[x][y]);
			}
			s += DFS(x + 1, y, num, max); // 不拿，和不能拿写在一起
			s %= N;
		}

		if (y < m - 1) {// 向右搜索
			if (max < map[x][y]) {// 可拿可不拿，不拿的情况可以想成是不符合条件所以不拿，这样来说就可以将其和不能拿一起处理
				s += DFS(x, y + 1, num + 1, map[x][y]);
			}
			s += DFS(x, y + 1, num, max);// 不拿，与不能拿时写在一起,这点很重要！
			s %= N;
		}

		// 说明本层内的都回溯完了 也就是本层DFS结束 此时要赋给这个状态s 即表示有多少条路径到达终点
		return dp[x][y][num][max + 1] = (int) s;
	}
}
