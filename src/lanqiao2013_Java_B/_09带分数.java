package lanqiao2013_Java_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _09带分数 {
    /*问题描述
100 可以表示为带分数的形式：100 = 3 + 69258 / 714。

    还可以表示为：100 = 82 + 3546 / 197。

    注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。

    类似这样的带分数，100 有 11 种表示法。

    输入格式
    从标准输入读入一个正整数N (N<1000*1000)

    输出格式
    程序输出该数字用数码1~9不重复不遗漏地组成带分数表示的全部种数。

    注意：不要求输出每个表示，只统计有多少表示法！

    样例输入1
100
    样例输出1
11
    样例输入2
105
    样例输出2
6
        【分析】用深度优先搜索，将1～9形成一个全排列，根据整数部分、分子和分母的长度来分割整个排列。设整数部分为a，分子为b，
        分母为c，这个数字的带分数形式就是a + (b / c)。a和b的长度是1～7，c的长度是由a和b来确定的，三个数字的总长度是9。
        最后验证a + (b / c)是否等于输入的数字。
*/

    public static int cnt = 0, num = 0;
    public static boolean isVisit[] = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(reader.readLine());
        reader.close();
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (9 - i - j >= 1) {
                    dfs(0, 0, 0, i, j, 9 -i - j);
                }
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int a, int b, int c, int alen, int blen, int clen) {
        if (alen == 0 && 0 == blen && 0 == clen) {
            if (b % c == 0 && b / c == num - a) {
                cnt++;
            }
            return;
        }

        for (int i = 1; i < 10; i++) {
            if (!isVisit[i]) {
                isVisit[i] = true;
                if (0 < alen) {
                    dfs(a * 10 + i, b, c, alen - 1, blen, clen);
                } else if (0 < blen) {
                    dfs(a, b * 10 + i, c, alen, blen - 1, clen);
                } else if (0 < clen) {
                    dfs(a, b, c * 10 + i, alen, blen, clen - 1);
                }
                isVisit[i] = false;
            }
        }
    }


}
