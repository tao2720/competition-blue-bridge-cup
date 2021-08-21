package lanqiao2013_Java_B;

public class _03振兴中华 {
    public static void main(String[] args) {

        int ans=f(0,0);
        System.out.println(ans);
    }

    private static int f(int i,int j){
        if(i==3 || j==4)return 1;
        return f(i+1,j)+f(i,j+1);
    }
}
