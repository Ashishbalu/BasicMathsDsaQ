package BasicMathsForDSAQ;

public class ReverseNumber {
    // to make the reverse of a number
    int reverse(int n){
        int reverseNum = 0;
        while (n>0){
            int lastDigit = n%10;
            n = n/10;
            reverseNum = (reverseNum*10)+lastDigit;
        }
        System.out.println(reverseNum);
        return reverseNum;
    }

    public static void main(String[] args) {
        ReverseNumber p2 = new ReverseNumber();
        p2.reverse(1234);
    }
}
