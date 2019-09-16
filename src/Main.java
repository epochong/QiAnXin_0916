import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/9/16 20:43
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String s = str.replaceAll("[^0-9]","-");
        String[] strings = s.split("-");
        int max = 0;
        String res = "";
        for (String string :
                strings) {
            if (string.length() > max) {
                max = string.length();
                res = string;
            }
        }
        if (max == 0) {
            System.out.println("0/");
        } else {
            System.out.println(max + "/" + res);
        }
    }
}
