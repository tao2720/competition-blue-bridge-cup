package lanqiaoRoger;

public class One {
    public static int count=0,n=4;
    public static void main(String[] args) {
        fun(0,0);
        System.out.println(count);
    }
    public static void fun(int left, int right){
        if(left==n){
            count++;
            return;
        }
        fun(left+1,right);
        if(left > right){
            fun(left,right+1);
        }
    }
}
