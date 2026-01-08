package BasicMathsForDSAQ;

import static java.lang.Math.log10;

public class CountDigit {
    // Given the number 'n', find out and return the number of digits present in a number..
   /* int  reverse(int n){
        int count = 0;
        while (n>0){
            int lastDigit = n%10;
            count = count+1;
            n=n/10;
        }
        System.out.println(count);
        return count;
    }*/

    // it can also be using this method --> Time complexity will be bid O(log10(n))
    int count(int n) {
        int cnt = (int) (log10(n) + 1);
        System.out.println(cnt);
        return cnt;
    }

    public static void main(String[] args) {
        CountDigit p1 = new CountDigit();
        p1.count(53246);
    }
}
