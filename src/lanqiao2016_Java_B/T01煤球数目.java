package lanqiao2016_Java_B;

/*
* 煤球堆成三角棱锥性
*
* 第一层 1个
* 第二层 3
*  三    6
*  四    10
* 一共100层,共多少个煤球？
*
*
* */

public class T01煤球数目 {

    public static void main(String[] args) {
        int p=1;
        int plus=2;
        long sum=1;
        for (int k = 3; k <= 101; k++) {
            p=p+plus;
            sum+=p;
            plus++;

        }
        System.out.println(sum);

    }

}
