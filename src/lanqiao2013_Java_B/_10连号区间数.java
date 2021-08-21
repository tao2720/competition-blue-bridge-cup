package lanqiao2013_Java_B;

import java.util.Scanner;

public class _10连号区间数 {
    /*题目描述
    小明这些天一直在思考这样一个奇怪而有趣的问题：
    在1~N的某个全排列中有多少个连号区间呢？这里所说的连号区间的定义是：
    如果区间[L,  R]  里的所有元素（即此排列的第L个到第R个元素）递增排序后能得到一个长度为R-L+1的“连续”数列，则称这个区间连号区间。
    当N很小的时候，小明可以很快地算出答案，但是当N变大的时候，问题就不是那么简单了，现在小明需要你的帮助。

    输入
    第一行是一个正整数N  (1  < =  N  < =  50000),  表示全排列的规模。
    第二行是N个不同的数字Pi(1  < =  Pi  < =  N)，  表示这N个数字的某一全排列。
    输出
    输出一个整数，表示不同连号区间的数目。
    样例输入
    5
    3  4  2  5  1
    样例输出
    9
    */
    public static int find(int []a) {
        int ans=0,n=a.length-1;
        int i,j;
        for(i=1;i<=n;i++) {
            int max=a[i],min=a[i];
            for(j=i;j<=n;j++) {
                max=a[j]>max?a[j]:max;
                min=a[j]<min?a[j]:min;
                if(max-min == j-i) ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            int []a = new int[n+1];
            for(int i = 1;i<=n;i++)
                a[i] = in.nextInt();
            int ans = find(a);
            System.out.println(ans);
        }
        in.close();
    }



}
