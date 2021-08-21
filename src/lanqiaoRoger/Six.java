package lanqiaoRoger;

import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        char[] newStr=new char[str.length()];
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])){
                if (chars[i]=='x' || chars[i]=='y' || chars[i]=='z'){
                    newStr[i]=(char)(chars[i]-'z'+'c');
                }else {
                    newStr[i]=(char)(chars[i]+3);
                }
            }
        }
        String string = String.valueOf(newStr);
        System.out.println(string);
    }
}
