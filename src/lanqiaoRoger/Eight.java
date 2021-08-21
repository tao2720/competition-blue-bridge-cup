package lanqiaoRoger;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] num=new int[m][n];
        int temp=1;
        int upBound=0;
        int rightBound=num[0].length-1;
        int leftBound=0;
        int downBound=num.length-1;
        while (true){
            for(int i=leftBound; i<=rightBound; ++i)
                num[upBound][i]=temp++;
            if(++upBound>downBound) break;
            for(int i=upBound; i<=downBound; ++i)
                num[i][rightBound]=temp++;
            if(--rightBound<leftBound)  break;
            for(int i=rightBound; i>=leftBound; --i)
                num[downBound][i]=temp++;
            if(--downBound<upBound) break;
            for(int i=downBound; i>=upBound; --i)
                num[i][leftBound]=temp++;
            if(++leftBound>rightBound)  break;
        }
        System.out.println(num[r-1][c-1]);
    }
}
