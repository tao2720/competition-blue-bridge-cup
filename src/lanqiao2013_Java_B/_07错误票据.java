package lanqiao2013_Java_B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _07错误票据 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int N=sc.nextInt();
        sc.nextLine();//吃掉换行符
        for (int i = 0; i < N; i++) {

            String line =sc.nextLine();
            String[] split =line.split(" ");
            for (int j = 0; j < split.length; j++) {
                list.add(Integer.parseInt(split[j]));

            }


        }
        //System.out.println(list.size());

        Collections.sort(list);
        int a=0,b=0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)-list.get(i-1)==2)
                a=list.get(i)-1;
            if (list.get(i).equals(list.get(i-1)))//
                 b=list.get(i);

        }
        System.out.println(a+" "+b);


    }



}
