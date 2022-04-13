package section1;

import edu.princeton.cs.algs4.StdOut;

/*
 * 对于一个整数转化成一个2进制数
 * 每次除以二就是“递位”的意思
 */
public class Exercise9 {
    public static void main(String[] args) {
        String s = "";
        int N = 12;
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        StdOut.println(s);
    }
}
