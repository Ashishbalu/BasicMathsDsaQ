package BasicMathsForDSAQ;

public class checkPalindrome {
    void palindrom(int n){
        int dup = n;
        int rev = 0;
        while (n>0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n = n/10;
        }
        if (rev == dup){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        checkPalindrome p3 = new checkPalindrome();
        p3.palindrom(1221);
    }
}
